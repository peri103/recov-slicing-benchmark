import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with ignoring surrounding spaces
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
            
            // Sample CSV data
            String csvData = "id, name, age\n1, John Doe, 30\n2, Jane Smith, 25";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Check if a specific column is set in the record
            /* read */ boolean isNameSet = record.isSet("name");
            
            // Print the result
            System.out.println("Is 'name' column set in the first record? " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}