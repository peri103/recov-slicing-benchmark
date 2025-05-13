import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with a custom delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
            
            // Sample CSV data
            String csvData = "name;age;city\nJohn Doe;30;New York";
            
            // Parse the CSV data using the specified format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Read the record as a string
            /* read */ String recordString = record.toString();
            
            // Print the record
            System.out.println(recordString);
            
            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}