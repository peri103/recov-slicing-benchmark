import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with auto flush
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withAutoFlush(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";
        
        // Parse the CSV data using the format
        List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

        // Read the first record and check if it's mapped
        /* read */ boolean isMapped = records.get(0).isMapped("name");
        
        System.out.println("Is 'name' mapped in the first record? " + isMapped);
    }
}