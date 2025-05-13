import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize a CSV string
        String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

        // Create a CSVFormat instance and configure it
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

        // Additional complexity: Create a map to store parsed data
        Map<String, String> dataMap = new HashMap<>();

        // Parse the CSV data using the format
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

        // Retrieve the records
        List<CSVRecord> records = parser.getRecords();

        // Access the first record
        CSVRecord record = records.get(0);

        // Store data in the map
        dataMap.put("Name", record.get("Name"));
        dataMap.put("Age", record.get("Age"));
        dataMap.put("Location", record.get("Location"));

        // Perform some operations on the map
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a specific column is mapped
        /* read */ boolean isMapped = record.isMapped("Name");

        // Output the result
        System.out.println("Is 'Name' mapped: " + isMapped);

        // Additional complexity: Perform calculations and logic
        int age = Integer.parseInt(dataMap.get("Age"));
        String location = dataMap.get("Location");

        if (age > 20 && location.equals("USA")) {
            System.out.println("Eligible for promotion.");
        } else {
            System.out.println("Not eligible for promotion.");
        }
    }
}