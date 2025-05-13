import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a custom delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');
        
        // Sample CSV data
        String csvData = "name;age;location\nJohn;30;New York\nJane;25;Los Angeles";
        
        // Additional data structures for complexity
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<String> locations = new ArrayList<>();
        
        try {
            // Parse the CSV data using the format with the custom delimiter
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));
            
            // Iterate over each record
            for (CSVRecord record : records) {
                // Split data into separate lists
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
                locations.add(record.get(2));
            }
            
            // Perform some operations on the lists
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            
            // Output the total age
            System.out.println("Total age: " + totalAge);
            
            // Read the first record and convert it to a string
            CSVRecord firstRecord = records.iterator().next();
            /* read */ String value = firstRecord.toString();
            
            // Output the first record
            System.out.println("First record: " + value);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Additional operations for complexity
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        
        for (String location : locations) {
            System.out.println("Location: " + location);
        }
    }
}