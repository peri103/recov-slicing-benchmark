import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "Name,Age,Location\nAlice,30,Wonderland\nBob,25,Builderland";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Unrelated code to make program more complex
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                ageMap.put(rec.get("Name"), Integer.parseInt(rec.get("Age")));
            }

            // Additional unrelated operations
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Perform more operations
            String location = record.get("Location");
            System.out.println("Location of first record: " + location);

            // Check if a column is set in the record
            /* read */ boolean isSet = record.isSet("Name");

            // Print result
            System.out.println("Is 'Name' column set: " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}