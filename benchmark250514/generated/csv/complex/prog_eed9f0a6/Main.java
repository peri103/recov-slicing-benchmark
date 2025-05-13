import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Creating a sample CSV data
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Adding complexity: Using ArrayList and HashMap
            ArrayList<String> headerList = new ArrayList<>();
            HashMap<String, String> dataMap = new HashMap<>();

            // Populate headerList and dataMap
            for (CSVRecord record : records) {
                headerList.add("header1");
                headerList.add("header2");
                dataMap.put(record.get("header1"), record.get("header2"));
            }

            // Print headers
            for (String header : headerList) {
                System.out.println("Header: " + header);
            }

            // Print data map
            for (String key : dataMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
            }

            // Assuming we are interested in the first record
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

            // Additional complexity: Perform operations on headerList and dataMap
            headerList.remove("header1");
            dataMap.put("newKey", "newValue");

            // Print updated headers
            for (String header : headerList) {
                System.out.println("Updated Header: " + header);
            }

            // Print updated data map
            for (String key : dataMap.keySet()) {
                System.out.println("Updated Key: " + key + ", Updated Value: " + dataMap.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}