import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with the write operation
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional data processing
            ArrayList<HashMap<String, String>> dataList = new ArrayList<>();
            for (CSVRecord record : records) {
                HashMap<String, String> dataMap = new HashMap<>();
                for (String header : record.toMap().keySet()) {
                    dataMap.put(header, record.get(header));
                }
                dataList.add(dataMap);
            }

            // Unrelated computations
            int sumOfAges = 0;
            for (HashMap<String, String> data : dataList) {
                sumOfAges += Integer.parseInt(data.get("age"));
            }
            System.out.println("Total sum of ages: " + sumOfAges);

            // Read operation on the first record
            /* read */ boolean isSet = records.get(0).isSet("name");
            
            // Print the result of the read operation
            System.out.println("Is 'name' set in the first record? " + isSet);

            // More unrelated computations
            int totalRecords = records.size();
            System.out.println("Total number of records: " + totalRecords);

            for (int i = 0; i < totalRecords; i++) {
                System.out.println("Record " + (i + 1) + ": " + records.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}