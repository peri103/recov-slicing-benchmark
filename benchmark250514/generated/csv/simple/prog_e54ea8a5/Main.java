import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();
            
            // Create a CSVParser to parse some CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, New York";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Use the read method to check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            
            // Output the result
            System.out.println(isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}