import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Check if 'Name' is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            
            // Output the result
            System.out.println("Is 'Name' mapped: " + isMapped);
            
            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}