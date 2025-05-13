import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Prepare a CSV input with the header comment
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a map to store processed records
            Map<String, String> recordMap = new HashMap<>();

            // Process each record
            for (CSVRecord record : parser) {
                String key = record.get("Header1");
                String value = record.get("Header2");
                recordMap.put(key, value);
            }

            // Perform some operations on the map
            for (Map.Entry<String, String> entry : recordMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Additional processing logic
            for (CSVRecord record : records) {
                String header1Value = record.get("Header1");
                if ("Value1".equals(header1Value)) {
                    System.out.println("Record with Header1=Value1 found.");
                }
            }

            // Read the comment from the first record
            String comment = records.get(0) /* read */.getComment();

            // Print the comment
            System.out.println(comment);

            // Additional complex logic
            int sum = 0;
            for (CSVRecord record : records) {
                sum += record.get("Header2").length();
            }
            System.out.println("Sum of lengths of Header2 values: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}