import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a CSV string to parse
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional complex logic
            ArrayList<String> dataList = new ArrayList<>();
            HashMap<String, Integer> dataMap = new HashMap<>();
            dataMap.put("key1", 100);
            dataMap.put("key2", 200);

            for (String key : dataMap.keySet()) {
                dataList.add(key + ":" + dataMap.get(key));
            }

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // More complex operations
            for (CSVRecord record : records) {
                for (String value : dataList) {
                    System.out.println("Processing: " + value);
                }
            }

            // Assuming the first record contains the data
            CSVRecord record = records.get(0);

            // Further operations before reading
            int sum = 0;
            for (int i = 0; i < dataList.size(); i++) {
                sum += dataMap.get("key" + (i + 1));
            }
            System.out.println("Sum of values in map: " + sum);

            // Read the comment
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

            // Extra operations after reading
            for (int i = 0; i < 5; i++) {
                System.out.println("Extra operation " + i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}