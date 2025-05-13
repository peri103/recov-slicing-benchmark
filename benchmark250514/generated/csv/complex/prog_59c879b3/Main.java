import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a header comment");

            // Simulate CSV data
            String csvData = "# This is a header comment\nName,Age\nJohn,30\nDoe,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional code: Process records and collect ages
            ArrayList<Integer> ages = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.getRecordNumber() > 1) { // Skip the header comment
                    String ageStr = record.get("Age");
                    int age = Integer.parseInt(ageStr);
                    ages.add(age);
                }
            }

            // Additional code: Calculate average age
            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            double averageAge = (double) sum / ages.size();
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first record
            String comment = /* read */ records.get(0).getComment();
            System.out.println("Header Comment: " + comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}