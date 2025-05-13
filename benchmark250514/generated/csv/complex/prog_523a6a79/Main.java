import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Prepare CSV data
        String csvData = " Name , Age , Location \n John Doe , 29 , USA ";

        // Create CSVFormat instance and configure it to ignore surrounding spaces
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Parse the CSV data using the configured format
        List<CSVRecord> records = null;
        try {
            records = format.parse(new java.io.StringReader(csvData)).getRecords();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Additional complex operations
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John Doe", 29);
        ageMap.put("Jane Smith", 34);

        ArrayList<String> locations = new ArrayList<>(Arrays.asList("USA", "Canada", "Mexico"));
        locations.add("Germany");

        for (String location : locations) {
            System.out.println("Location: " + location);
        }

        // Further processing
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Read the first record and check consistency
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);
        }
        
        // Additional complex operations
        int sumOfAges = 0;
        for (int age : ageMap.values()) {
            sumOfAges += age;
        }
        System.out.println("Sum of ages: " + sumOfAges);

        double averageAge = sumOfAges / (double) ageMap.size();
        System.out.println("Average age: " + averageAge);

        // More list operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}