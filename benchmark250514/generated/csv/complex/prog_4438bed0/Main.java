import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        // Use CSVFormat to parse the CSV data
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeader("Name", "Age", "Location");

        // Additional unrelated data structures and operations
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("Alice", 28);
        nameToAge.put("Bob", 34);

        // Perform some operations on the data structures
        for (String name : names) {
            System.out.println("Name: " + name + ", Age: " + nameToAge.get(name));
        }

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Additional operations on CSVRecord
                String name = record.get("Name");
                String location = record.get("Location");
                System.out.println("Record Name: " + name + ", Location: " + location);
                
                /* read */ boolean isSet = record.isSet("Age");
                System.out.println("Is 'Age' column set in record: " + isSet);
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // More complex operations
        int totalAge = 0;
        for (Integer age : nameToAge.values()) {
            totalAge += age;
        }
        System.out.println("Total Age: " + totalAge);
    }
}