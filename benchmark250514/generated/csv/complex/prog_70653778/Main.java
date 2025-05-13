import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat csvFormat = CSVFormat.DEFAULT.withNullString("NULL");
            /* write */ csvFormat = csvFormat.withNullString("NULL");

            // Prepare a sample CSV data
            String csvData = "Name,Age,Location\nJohn,NULL,New York\nDoe,25,NULL";

            // Parse CSV data using the format
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Initialize a map to store the parsed data
            Map<String, String> dataMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                String location = record.get("Location");
                dataMap.put(name, age + " years old, located in " + location);
            }

            // Process data in map
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue());
            }

            // Additional processing
            int totalAge = 0;
            for (CSVRecord record : records) {
                String ageStr = record.get("Age");
                if (!ageStr.equals("NULL")) {
                    totalAge += Integer.parseInt(ageStr);
                }
            }
            System.out.println("Total age of all individuals: " + totalAge);

            // Read the value using the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Location");
            System.out.println("Is 'Location' set for the first record? " + isSet);

            // Further processing
            for (CSVRecord rec : records) {
                if (rec.isSet("Location")) {
                    System.out.println(rec.get("Name") + " has a location set.");
                } else {
                    System.out.println(rec.get("Name") + " has no location set.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}