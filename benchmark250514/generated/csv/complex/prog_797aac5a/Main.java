import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSV format and apply the 'withTrim' method
            CSVFormat format = CSVFormat.DEFAULT.withTrim(); /* write */

            // Prepare a sample CSV input
            String csvData = "header1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Create a complex data structure
            ArrayList<HashMap<String, String>> dataList = new ArrayList<>();
            HashMap<String, String> dataMap = new HashMap<>();
            dataMap.put("key1", "value1");
            dataMap.put("key2", "value2");
            dataList.add(dataMap);

            // Perform operations on the complex data structure
            for (HashMap<String, String> map : dataList) {
                for (String key : map.keySet()) {
                    System.out.println("Key: " + key + ", Value: " + map.get(key));
                }
            }

            // Read the first record and check if a header is mapped
            CSVRecord record = records.get(0);
            boolean isMapped = record.isMapped("header1"); /* read */

            // Output the result
            System.out.println("Is 'header1' mapped: " + isMapped);

            // Additional operations on CSV records
            for (CSVRecord rec : records) {
                for (String header : rec.toMap().keySet()) {
                    System.out.println("Header: " + header + ", Value: " + rec.get(header));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}