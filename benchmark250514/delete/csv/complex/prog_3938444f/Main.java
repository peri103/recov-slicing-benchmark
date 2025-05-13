import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the format
        /* write */ format = format.withIgnoreHeaderCase(true);

        // Create a sample CSVRecord for demonstration
        String[] values = {"Name", "Age", "Country"};
        CSVRecord record = new CSVRecord(null, values, 0, 0);

        // Add some complexity with unrelated operations
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Alice", 30);
        dataMap.put("Bob", 25);
        dataMap.put("Charlie", 35);

        int sumOfAges = 0;
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            sumOfAges += entry.getValue();
        }
        System.out.println("Sum of ages: " + sumOfAges);

        List<String> countries = Arrays.asList("USA", "Canada", "UK");
        for (String country : countries) {
            System.out.println("Country: " + country);
        }

        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("name");

        // Output the result
        System.out.println("Is 'name' mapped: " + isMapped);

        // Additional complexity with more operations
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("UK", "London");

        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue());
        }
    }
}