import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat object
        /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);
        
        // Create a dummy CSV input
        String csvInput = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";
        
        // Parse the CSV data
        Reader in = new StringReader(csvInput);
        ArrayList<CSVRecord> records = new ArrayList<>();
        
        try {
            CSVParser parser = new CSVParser(in, csvFormat);
            for (CSVRecord record : parser) {
                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Perform some operations on the records
        for (CSVRecord record : records) {
            System.out.println("Name: " + record.get(0) + ", Age: " + record.get(1) + ", City: " + record.get(2));
        }
        
        // Initialize a dummy CSVRecord object for demonstration
        CSVRecord dummyRecord = new CSVRecord(null, null, csvFormat, 0, 0);
        
        // Use the read method to check consistency
        /* read */ boolean isConsistent = dummyRecord.isConsistent();
        
        // Print the result
        System.out.println("Is the dummy CSVRecord consistent? " + isConsistent);
        
        // Additional complex operations
        int sumOfAges = 0;
        for (CSVRecord record : records) {
            sumOfAges += Integer.parseInt(record.get(1));
        }
        System.out.println("Sum of ages: " + sumOfAges);
        
        // More operations with CSVFormat
        CSVFormat newFormat = csvFormat.withDelimiter(';');
        System.out.println("New delimiter set for CSVFormat.");
    }
}