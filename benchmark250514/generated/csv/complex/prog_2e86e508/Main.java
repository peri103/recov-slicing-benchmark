import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,UK";

            // Create CSVFormat with the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Initialize a map to store the records
            Map<String, String> recordsMap = new HashMap<>();

            // Parse the CSV data
            CSVParser parser = format.parse(new StringReader(csvData));
            List<CSVRecord> records = parser.getRecords();

            // Populate the map with the first record
            CSVRecord firstRecord = records.get(0);
            for (String header : parser.getHeaderMap().keySet()) {
                recordsMap.put(header, firstRecord.get(header));
            }

            // Perform some operations on the map
            for (Map.Entry<String, String> entry : recordsMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Check if a specific header is mapped in the first record
            /* read */ boolean isMapped = firstRecord.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped: " + isMapped);

            // Further manipulation of records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
                for (String header : parser.getHeaderMap().keySet()) {
                    System.out.println(header + ": " + record.get(header));
                }
            }

            // Additional logic to manipulate data
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Total Age: " + totalAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}