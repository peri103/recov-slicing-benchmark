import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with a header
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
        String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,UK";

        // Create a map to store the records
        Map<String, Integer> ageMap = new HashMap<>();

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Iterate over the records and populate the map
            for (CSVRecord record : parser) {
                // Extract the name and age from the record
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Parse the CSV data again to demonstrate the original read operation
            parser = CSVParser.parse(new StringReader(csvData), format);

            for (CSVRecord record : parser) {
                // Check if a specific header is set
                /* read */ boolean isNameSet = record.isSet("Name");
                System.out.println("Is 'Name' header set? " + isNameSet);
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional unrelated operations
        int sumOfAges = 0;
        for (Integer age : ageMap.values()) {
            sumOfAges += age;
        }
        System.out.println("Sum of ages: " + sumOfAges);

        // Demonstrate some basic arithmetic operations
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("Sum of a and b: " + c);

        c = b - a;
        System.out.println("Difference of b and a: " + c);

        c = a * b;
        System.out.println("Product of a and b: " + c);

        if (b != 0) {
            c = b / a;
            System.out.println("Division of b by a: " + c);
        }
    }
}