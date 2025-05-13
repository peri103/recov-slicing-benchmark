import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
            
            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("Name");
            
            // Output the result
            System.out.println("Is 'Name' mapped in the first record? " + isMapped);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}