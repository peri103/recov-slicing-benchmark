import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat using the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);
        
        // Create a CSVParser to parse a sample CSV input
        String csvData = "Name,Age\nJohn,30\nDoe,25";
        List<CSVRecord> records = null;
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Use the read method on the first CSVRecord
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the record consistent? " + isConsistent);
        }
    }
}