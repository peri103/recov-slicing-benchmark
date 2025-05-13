import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat csvFormat = CSVFormat.DEFAULT.withTrailingDelimiter();
        // Simulate CSV input data
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";
        
        try {
            // Parse the CSV data using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            // Assume we want to check the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Check if a certain column is set
            /* read */ boolean isSet = record.isSet("age");
            System.out.println("Is 'age' column set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}