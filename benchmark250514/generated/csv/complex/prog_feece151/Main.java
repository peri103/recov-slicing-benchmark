import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Create a sample CSV data
            String csvData = "Column1,Column2\nValue1,Value2";

            // Parse the CSV data using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize a HashMap to store parsed data
            HashMap<String, String> dataMap = new HashMap<>();

            // Process each CSVRecord and store it in the HashMap
            for (CSVRecord record : parser) {
                String column1Value = record.get("Column1");
                String column2Value = record.get("Column2");
                dataMap.put(column1Value, column2Value);
            }

            // Perform some operations on the HashMap
            for (String key : dataMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
            }

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Read the comment from the first record
            /* read */ String comment = firstRecord.getComment();

            // Output the comment
            System.out.println("Comment from the first record: " + comment);

            // Additional complex operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Further manipulation of the dataMap
            if (dataMap.containsKey("Value1")) {
                dataMap.put("Value1", "UpdatedValue");
            }

            // Print updated dataMap
            for (String key : dataMap.keySet()) {
                System.out.println("Updated Key: " + key + ", Updated Value: " + dataMap.get(key));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}