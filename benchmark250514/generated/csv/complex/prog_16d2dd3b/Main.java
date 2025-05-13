import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with a custom delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
            
            // Sample CSV data
            String csvData = "name;age;city\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";
            
            // Parse the CSV data using the specified format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Retrieve all records
            List<CSVRecord> records = parser.getRecords();
            
            // Process records and store names in a list
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get(0)); // Assume the first column is the name
            }
            
            // Perform some operations on the list of names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }
            
            // Retrieve and read the first record as a string
            CSVRecord firstRecord = records.get(0);
            /* read */ String recordString = firstRecord.toString();
            
            // Print the first record
            System.out.println("First record: " + recordString);
            
            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Additional unrelated code to increase complexity
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // Perform some operations on the numbers list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }
    }
}