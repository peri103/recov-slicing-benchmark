import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
        
        // Sample CSV data
        String csvData = "name,age\nJohn Doe,30\nJane Smith,25";
        
        try {
            // Parse the CSV data using the format with trailing delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Iterate over the records and read a value
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set: " + isSet);
                // Break after the first read operation
                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}