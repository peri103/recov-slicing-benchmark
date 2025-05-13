import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignore header case
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Simulate a CSVRecord
        List<String> headers = Arrays.asList("Name", "Age", "Country");
        List<String> values = Arrays.asList("Alice", "30", "USA");
        CSVRecord record = new CSVRecord(null, values.toArray(new String[0]), headers.toArray(new String[0]), 0, 0);

        // Additional code using Map for complexity
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Process and print age information
        for (String name : ageMap.keySet()) {
            System.out.println(name + " is " + ageMap.get(name) + " years old.");
        }

        // More complex operations
        int sumOfAges = 0;
        for (Integer age : ageMap.values()) {
            sumOfAges += age;
        }
        System.out.println("Total sum of ages: " + sumOfAges);

        // Check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("name");
        System.out.println("Is 'name' mapped: " + isMapped);

        // Further operations on CSVRecord
        for (String header : headers) {
            System.out.println("Header: " + header + ", Value: " + record.get(header));
        }
    }
}