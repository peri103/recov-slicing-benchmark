import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Prepare a CSV string for demonstration
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        // Create a CSVFormat instance with the first record as header
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withFirstRecordAsHeader();

        // Unrelated code: Working with a HashMap
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Jane", 25);

        // Perform some operations on the map
        if (ageMap.containsKey("John")) {
            int age = ageMap.get("John");
            System.out.println("John's age: " + age);
        }

        try (Reader reader = new StringReader(csvData); CSVParser parser = new CSVParser(reader, format)) {
            for (CSVRecord record : parser) {
                // Accessing the header mappings
                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);

                // Additional code to print each record
                String name = record.get("Name");
                String age = record.get("Age");
                String location = record.get("Location");
                System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // More unrelated code: Calculating the sum of ages
        int totalAge = 0;
        for (int age : ageMap.values()) {
            totalAge += age;
        }
        System.out.println("Total age: " + totalAge);
    }
}