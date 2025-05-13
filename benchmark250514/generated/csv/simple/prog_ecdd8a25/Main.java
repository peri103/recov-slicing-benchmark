import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with the write method
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        
        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";
        
        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            for (CSVRecord record : parser) {
                // Use the read method to check if a column is set
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' column set? " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}