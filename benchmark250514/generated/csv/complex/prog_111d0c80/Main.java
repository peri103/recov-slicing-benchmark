import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV input
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create a map to store data from the CSV
            Map<String, Integer> ageMap = new HashMap<>();

            // Iterate through the records and populate the map
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            int johnsAge = ageMap.get("John");
            System.out.println("John's age is: " + johnsAge);

            // Get the first record again for demonstration
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Check if a specific column index is set
            /* read */ boolean isSet = firstRecord.isSet(0);

            // Output the result
            System.out.println("Is column index 0 set? " + isSet);

            // Additional logic to manipulate and display map data
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}