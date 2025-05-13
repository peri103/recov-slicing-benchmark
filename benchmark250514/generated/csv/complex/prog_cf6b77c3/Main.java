import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Prepare CSV data to parse
            String csvData = "Name,Age\nJohn\\, Doe,30\nJane\\, Smith,25";

            // Parse CSV data using the format with escape character
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Iterate through records and populate the map
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                nameAgeMap.put(name, age);
            }

            // Additional processing on the map
            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                totalAge += entry.getValue();
            }

            System.out.println("Total Age: " + totalAge);

            // Use an ArrayList to store processed data
            ArrayList<String> processedData = new ArrayList<>();
            for (CSVRecord record : records) {
                processedData.add(record.toString());
            }

            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();

            // Print the result
            System.out.println(recordString);

            // Print processed data
            for (String data : processedData) {
                System.out.println("Processed: " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}