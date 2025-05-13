import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Define CSV content
            String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,San Francisco";
            
            // Create CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Location");
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the first record and check if a header is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            
            // Print the result
            System.out.println("Is 'Name' header set in the first record? " + isSet);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}