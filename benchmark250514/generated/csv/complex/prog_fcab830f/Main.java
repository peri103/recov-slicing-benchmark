import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Sample CSV data
            String csvData = "Name;Age;Location\nJohn;30;USA\nDoe;25;UK";

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create a map to store CSV data in a structured way
            HashMap<String, ArrayList<String>> csvDataMap = new HashMap<>();

            // Process the records and populate the map
            for (CSVRecord record : records) {
                String name = record.get(0);
                String age = record.get(1);
                String location = record.get(2);

                ArrayList<String> details = new ArrayList<>();
                details.add(age);
                details.add(location);

                csvDataMap.put(name, details);
            }

            // Additional unrelated computation
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers 1 to 10: " + sum);

            // Retrieve and print data from the map
            for (String key : csvDataMap.keySet()) {
                ArrayList<String> details = csvDataMap.get(key);
                System.out.println("Name: " + key + ", Age: " + details.get(0) + ", Location: " + details.get(1));
            }

            // Read and print the first CSVRecord
            /* read */ String recordString = records.get(0).toString();
            System.out.println("First record: " + recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}