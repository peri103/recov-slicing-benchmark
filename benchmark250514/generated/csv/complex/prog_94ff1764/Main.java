import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV format with ignore header case
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name, Age, Country\nJohn, 30, USA\nJane, 25, UK";
        
        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Get all records
            ArrayList<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Process each record and store in a map
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name.toLowerCase(), age);
            }

            // Additional data processing
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Check if a column is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

            // More processing with the map
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}