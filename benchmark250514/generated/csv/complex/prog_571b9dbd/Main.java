import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a header
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeader("Name", "Age", "Country");

        // Sample CSV data
        String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,UK\n";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record1 = parser.getRecords().get(0);
            CSVRecord record2 = parser.getRecords().get(1);

            // Additional complex operations
            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put(record1.get("Name"), Integer.parseInt(record1.get("Age")));
            ageMap.put(record2.get("Name"), Integer.parseInt(record2.get("Age")));

            // Process the age map
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Check if the "Age" header is set in the first record
            /* read */ boolean isSet = record1.isSet("Age");
            System.out.println("Is 'Age' set in the first record? " + isSet);

            // More complex operations
            for (String name : ageMap.keySet()) {
                System.out.println(name + " is " + ageMap.get(name) + " years old.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}