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
            // Initialize CSVFormat with a null string
            CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
            /* write */ format = format.withNullString("NULL");

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,NULL,USA\nJane,30,UK";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Perform some unrelated calculations
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            nameToAgeMap.put("John", 25);
            nameToAgeMap.put("Jane", 30);
            int totalAge = 0;
            for (Integer age : nameToAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Perform operations on the CSV data
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                String age = rec.get("Age");
                String location = rec.get("Location");
                System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);
            }

            // Check if the 'Location' field is set
            /* read */ boolean isLocationSet = record.isSet("Location");

            System.out.println("Is 'Location' set for the first record? " + isLocationSet);

            // Additional logic to manipulate the records
            for (CSVRecord rec : parser) {
                if ("NULL".equals(rec.get("Age"))) {
                    System.out.println(rec.get("Name") + " has no age specified.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}