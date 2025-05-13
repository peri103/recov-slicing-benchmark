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
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

            // Initialize CSVFormat with the first record as header
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Additional unrelated operations
            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("John", 30);
            ageMap.put("Doe", 25);

            // Perform some operations on the map
            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                totalAge += entry.getValue();
            }
            System.out.println("Total Age: " + totalAge);

            // Perform some more operations on the CSV data
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                String location = rec.get("Location");
                System.out.println("Name: " + name + ", Location: " + location);
            }

            // Check if a particular header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' header mapped? " + isMapped);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}