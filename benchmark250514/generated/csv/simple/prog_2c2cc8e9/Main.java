import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
            
            // Create a sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nAlice,25,UK";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);
            
            // Get the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);
            
            // Check if a field is set in the record
            /* read */ boolean isSet = record.isSet("Name");
            
            // Print the result
            System.out.println("Is 'Name' set in the record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}