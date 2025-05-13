import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a sample CSV string
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";
        
        // Create a list to store CSV records
        List<CSVRecord> allRecords = new ArrayList<>();
        
        try {
            // Create a CSVFormat instance with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Add all records to the list
            allRecords.addAll(parser.getRecords());

            // Perform some operations on the records
            for (CSVRecord rec : allRecords) {
                System.out.println("Name: " + rec.get("name"));
            }
            
            // Get the first record
            CSVRecord record = allRecords.get(0);

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord rec : allRecords) {
                sumOfAges += Integer.parseInt(rec.get("age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Use the read method to check if a field is mapped
            /* read */ boolean isMapped = record.isMapped("name");

            // Print the result of the read operation
            System.out.println("Is 'name' mapped: " + isMapped);

            // Perform more complex operations
            double averageAge = sumOfAges / (double) allRecords.size();
            System.out.println("Average age: " + averageAge);

            // Check if other fields are mapped
            boolean isAgeMapped = record.isMapped("age");
            boolean isCityMapped = record.isMapped("city");
            System.out.println("Is 'age' mapped: " + isAgeMapped);
            System.out.println("Is 'city' mapped: " + isCityMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}