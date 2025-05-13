import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object and configure it to ignore header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Simulate CSVRecord creation
        List<String> headers = new ArrayList<>();
        headers.add("Name");
        headers.add("Age");

        List<String> values = new ArrayList<>();
        values.add("John Doe");
        values.add("30");

        CSVRecord record = new CSVRecord(values, headers, 0, 0);

        // Create a map to demonstrate additional complexity
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John Doe", 30);
        ageMap.put("Jane Smith", 25);

        // Loop through the map and print each entry
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Perform some additional operations on the CSVRecord
        String name = record.get(0);
        int age = Integer.parseInt(record.get(1));
        System.out.println("Record Name: " + name + ", Record Age: " + age);

        // Check if a specific header is mapped
        // This is the original read operation
        /* read */ boolean isMapped = record.isMapped("name"); // should be true due to ignore header case
        System.out.println("Is 'name' mapped: " + isMapped);

        // Additional logic to manipulate data
        if (isMapped) {
            ageMap.put(name, age + 5);
        }

        // Print the updated map
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Updated Name: " + entry.getKey() + ", Updated Age: " + entry.getValue());
        }
    }
}