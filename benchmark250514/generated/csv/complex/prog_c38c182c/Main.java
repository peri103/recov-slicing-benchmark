import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create a map to store CSV data
            Map<String, String> csvDataMap = new HashMap<>();

            // Iterate over records and store them in the map
            for (CSVRecord record : parser) {
                csvDataMap.put(record.get("Header1"), record.get("Header2"));
            }

            // Perform some operations on the map
            for (Map.Entry<String, String> entry : csvDataMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Perform more operations
            int sum = 0;
            for (String key : csvDataMap.keySet()) {
                sum += key.length();
            }
            System.out.println("Total length of keys: " + sum);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Output the comment
            System.out.println("Comment: " + comment);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}