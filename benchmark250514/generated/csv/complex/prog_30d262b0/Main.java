import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";

        // Parse the CSV data
        Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

        // Complex operations with HashMap
        Map<String, Integer> nameAgeMap = new HashMap<>();
        for (CSVRecord record : records) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            nameAgeMap.put(name, age);
        }

        // Process the map
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Re-parsing the CSV data to demonstrate the read operation
        records = format.parse(new StringReader(csvData));
        Iterator<CSVRecord> iterator = records.iterator();
        if (iterator.hasNext()) {
            CSVRecord record = iterator.next();
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);
        }

        // Additional complex logic
        int sumOfAges = 0;
        for (Integer age : nameAgeMap.values()) {
            sumOfAges += age;
        }
        System.out.println("Sum of all ages: " + sumOfAges);

        // Manipulate the map
        nameAgeMap.put("Alice", 28);
        System.out.println("Added Alice with age: " + nameAgeMap.get("Alice"));
    }
}