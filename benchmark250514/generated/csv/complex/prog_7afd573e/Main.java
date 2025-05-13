import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a header comment");

        // Simulate parsing a CSV file with the given format
        String csvData = "# This is a header comment\nHeader1,Header2\nValue1,Value2";
        
        try {
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0); // Get the first record
            
            // Unrelated complex operations
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Key1", 100);
            map.put("Key2", 200);
            int sum = 0;
            for (String key : map.keySet()) {
                sum += map.get(key);
            }
            System.out.println("Sum of values in map: " + sum);

            // More complex operations
            for (CSVRecord rec : records) {
                for (String header : format.getHeader()) {
                    System.out.println("Header: " + header + ", Value: " + rec.get(header));
                }
            }

            /* read */ String comment = record.getComment();
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}