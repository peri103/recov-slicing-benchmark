import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("HeaderComment");

            // Prepare a sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records from the CSVParser
            List<CSVRecord> records = parser.getRecords();

            // Complex data processing logic
            ArrayList<HashMap<String, String>> processedData = new ArrayList<>();
            for (CSVRecord record : records) {
                HashMap<String, String> dataMap = new HashMap<>();
                for (String header : record.toMap().keySet()) {
                    dataMap.put(header, record.get(header));
                }
                processedData.add(dataMap);
            }

            // Additional operations on processed data
            for (HashMap<String, String> dataMap : processedData) {
                System.out.println("Processing: " + dataMap);
                if (dataMap.get("Age").equals("30")) {
                    dataMap.put("Status", "Adult");
                } else {
                    dataMap.put("Status", "Young Adult");
                }
            }

            // Check if a specific header is set in the first record
            /* read */ boolean isSet = records.get(0).isSet("Name");

            // Output the result
            System.out.println("Is 'Name' header set in the first record? " + isSet);

            // Further processing on the processedData list
            for (HashMap<String, String> dataMap : processedData) {
                System.out.println("Final Data: " + dataMap);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}