import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat object
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Prepare a CSV string
            String csvData = "id,name,age\n1,John Doe,30\n2,Jane Doe,25\n\n3,Bob Smith,40";

            // Parse the CSV string using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Create a list to store ages
            ArrayList<Integer> ages = new ArrayList<>();

            // Process each record to extract age
            for (CSVRecord rec : records) {
                if (rec.isSet("age")) {
                    int age = Integer.parseInt(rec.get("age"));
                    ages.add(age);
                }
            }

            // Calculate average age
            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            double averageAge = (ages.size() > 0) ? (double) sum / ages.size() : 0;
            System.out.println("Average Age: " + averageAge);

            // Check if a column is set in the first record
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' column set in the first record? " + isSet);

            // Additional processing
            int count = 0;
            for (CSVRecord rec : records) {
                if (rec.isSet("id")) {
                    count++;
                }
            }
            System.out.println("Total records with 'id' set: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}