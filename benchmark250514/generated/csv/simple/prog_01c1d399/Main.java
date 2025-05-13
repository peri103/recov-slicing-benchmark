import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT /* write */.withTrailingDelimiter();
            
            // Create a CSV content
            String csvContent = "name,age\nJohn,30\nJane,25\n";
            
            // Parse the CSV content using the format
            CSVParser parser = new CSVParser(new StringReader(csvContent), format);
            
            // Read the first record
            CSVRecord record = parser.iterator().next();
            
            // Check if the first column is set
            /* read */ boolean isSet = record.isSet("name");
            
            // Output the result
            System.out.println("Is 'name' set in the first record? " + isSet);
            
            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}