import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

            // Configure CSVFormat with a header comment
            CSVFormat format = CSVFormat.DEFAULT
                    /* write */ .withHeaderComments("This is a comment");

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated code
            Map<String, Integer> map = new HashMap<>();
            map.put("Key1", 100);
            map.put("Key2", 200);
            map.put("Key3", 300);

            int total = 0;
            for (String key : map.keySet()) {
                total += map.get(key);
            }
            System.out.println("Total: " + total);

            // Iterate over records and print them
            for (CSVRecord record : records) {
                System.out.println("Record: " + record.toString());
            }

            // Read the comment from the first record
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            // Output the comment
            System.out.println(comment);

            // More complex operations
            Map<String, String> complexMap = new HashMap<>();
            complexMap.put("A", "Alpha");
            complexMap.put("B", "Bravo");
            complexMap.put("C", "Charlie");

            for (Map.Entry<String, String> entry : complexMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}