import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and set the header using the write method
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
            
            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,25,USA\nAlice,30,UK";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Check if a specific header is set using the read method
            /* read */ boolean isNameSet = record.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' header set? " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}