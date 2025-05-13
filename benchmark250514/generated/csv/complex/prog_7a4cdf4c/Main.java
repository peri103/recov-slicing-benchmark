import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim setting
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Occupation\nJohn Doe, 30, Engineer\nJane Doe, 25, Doctor";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Create a list to store names
            ArrayList<String> names = new ArrayList<>();

            // Create a map to store age by name
            HashMap<String, Integer> ageMap = new HashMap<>();

            // Iterate through records
            for (CSVRecord record : records) {
                // Add names to the list
                names.add(record.get("Name"));

                // Add age to the map
                ageMap.put(record.get("Name"), Integer.parseInt(record.get("Age")));
            }

            // Print all names
            System.out.println("Names: " + names);

            // Access age using name
            String person = "John Doe";
            if (ageMap.containsKey(person)) {
                System.out.println(person + " is " + ageMap.get(person) + " years old.");
            }

            // Check if a column is mapped
            for (CSVRecord record : records) {
                /* read */ boolean isMapped = record.isMapped("Occupation");
                System.out.println("Is 'Occupation' column mapped? " + isMapped);
                break; // Ensure the read operation is executed only once
            }

            // More complex operations
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age of all persons: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}