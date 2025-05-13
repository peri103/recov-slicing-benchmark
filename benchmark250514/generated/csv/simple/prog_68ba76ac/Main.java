import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "header1,header2\nvalue1,value2\n,value3";
            
            // Initialize CSVFormat with the write method
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the first record to check consistency
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            
            // Print the result
            System.out.println("Is the first record consistent? " + isConsistent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}