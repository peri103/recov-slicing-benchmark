import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "Name,Age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Additional complex code with a different API
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                names.add(name);
            }

            // Process the names list
            int totalLength = 0;
            for (String name : names) {
                totalLength += name.length();
            }
            System.out.println("Total length of names: " + totalLength);

            // Further processing with the CSV records
            int totalAge = 0;
            for (CSVRecord record : records) {
                int age = Integer.parseInt(record.get("Age"));
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println("Comment from CSV: " + comment);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}