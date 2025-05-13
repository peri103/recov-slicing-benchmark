import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize CSVFormat with headers
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withHeader("Name", "Age", "Country");

        // Step 2: Create a mock CSVRecord for demonstration purposes
        String[] values = {"John Doe", "30", "USA"};
        CSVRecord csvRecord = new CSVRecord(null, values, csvFormat.getHeaderMap(), 0, 0);

        // Step 3: Initialize a map to store some data
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John Doe", 30);
        ageMap.put("Jane Smith", 25);

        // Step 4: Perform operations on the map
        if (ageMap.containsKey("John Doe")) {
            int age = ageMap.get("John Doe");
            System.out.println("John Doe's age is: " + age);
        }

        // Step 5: Check if a specific header is set in the record
        /* read */ boolean isSet = csvRecord.isSet("Age");
        System.out.println("Is 'Age' set: " + isSet);

        // Step 6: Additional operations with the map
        ageMap.put("Alice Brown", 28);
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}