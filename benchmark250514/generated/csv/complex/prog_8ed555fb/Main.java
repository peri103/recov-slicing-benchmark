import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

            // Parse CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Create a map to store the sum of ages by city
            Map<String, Integer> ageSumByCity = new HashMap<>();

            // Process each record
            for (CSVRecord record : records) {
                String city = record.get("city");
                int age = Integer.parseInt(record.get("age"));

                // Update the sum of ages for the city
                ageSumByCity.put(city, ageSumByCity.getOrDefault(city, 0) + age);
            }

            // Output the sum of ages by city
            for (Map.Entry<String, Integer> entry : ageSumByCity.entrySet()) {
                System.out.println("City: " + entry.getKey() + ", Total Age: " + entry.getValue());
            }

            // Read and check if a specific column is set in the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("age");

            System.out.println("Is 'age' column set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}