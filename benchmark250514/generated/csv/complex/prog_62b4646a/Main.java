import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a sample CSV input
        String csvData = "Name,Age,Location\nJohn,NULL,USA\nJane,25,NULL";

        // Parse the CSV data using the format
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional logic: Count occurrences of each location
            Map<String, Integer> locationCount = new HashMap<>();
            for (CSVRecord record : records) {
                String location = record.get("Location");
                locationCount.put(location, locationCount.getOrDefault(location, 0) + 1);
            }

            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Location");

            // Print whether 'Location' is set in the first record
            System.out.println("Is 'Location' set in the first record? " + isSet);

            // Print the occurrences of each location
            for (Map.Entry<String, Integer> entry : locationCount.entrySet()) {
                System.out.println("Location: " + entry.getKey() + ", Count: " + entry.getValue());
            }

            // Additional logic: Check if all records have 'Age' set
            boolean allHaveAge = true;
            for (CSVRecord rec : records) {
                if (!rec.isSet("Age")) {
                    allHaveAge = false;
                    break;
                }
            }
            System.out.println("Do all records have 'Age' set? " + allHaveAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}