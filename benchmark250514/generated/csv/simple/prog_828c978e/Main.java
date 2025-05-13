import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";
        
        try {
            // Create a CSVFormat object with the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();
            
            // Get the first record
            CSVRecord record = records.get(0);
            
            // Check if the 'Name' field is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            
            // Output the result
            System.out.println("Is 'Name' field mapped? " + isMapped);
            
            // Close the parser
            parser.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}