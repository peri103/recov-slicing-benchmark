import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with ignored header case
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,New York\nDoe,25,Los Angeles";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Process each record and store in a map
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Additional processing
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Read the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Check if a column is mapped (case-insensitive due to the format setting)
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}