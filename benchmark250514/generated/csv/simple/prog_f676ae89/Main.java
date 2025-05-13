import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Define the CSV format with headers
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
            
            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,UK";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read from the first record to check if a header is set
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' header set in first record? " + isNameSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}