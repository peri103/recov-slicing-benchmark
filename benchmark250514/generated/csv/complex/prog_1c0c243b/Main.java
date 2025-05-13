import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to set a null string representation
        /* write */ format = format.withNullString("NULL");

        // Create a complex data structure to manipulate
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Perform some operations on the list
        for (String city : cities) {
            System.out.println("City: " + city);
        }

        // Create another CSV string to parse with multiple records
        String csvData = "name,age,city\nJohn,30,NULL\nJane,25,Los Angeles\nDoe,40,Chicago";

        try {
            // Parse the CSV string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Access the first record
            CSVRecord record = records.get(0);
            
            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);

            // Use the read method to check if a field is set
            /* read */ boolean isSet = record.isSet("city");
            
            // Print the result
            System.out.println("Is 'city' set: " + isSet);

            // Perform operations on the parsed records
            for (CSVRecord rec : records) {
                System.out.println("Name: " + rec.get("name") + ", Age: " + rec.get("age"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}