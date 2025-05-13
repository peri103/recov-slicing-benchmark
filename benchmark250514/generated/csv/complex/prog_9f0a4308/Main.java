import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

            // Prepare a sample CSV input to parse
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create a HashMap to store parsed values
            HashMap<String, String> dataMap = new HashMap<>();

            // Populate the HashMap with CSV data
            for (CSVRecord record : records) {
                dataMap.put(record.get(0), record.get(1));
            }

            // Perform some operations on the HashMap
            for (String key : dataMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
            }

            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println("Comment: " + comment);

            // Additional complex operations
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += i * 10;
            }
            System.out.println("Sum of multiples of 10 from 0 to 4: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}