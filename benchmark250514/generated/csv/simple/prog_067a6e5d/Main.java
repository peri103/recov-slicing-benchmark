import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age, Location\nJohn Doe, 29, USA\nJane Smith, 34, UK";
        
        // Initialize CSVFormat with ignoring header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();
        
        // Parse CSV data
        List<CSVRecord> records = new ArrayList<>();
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Read the first record and check if a column is mapped
        CSVRecord record = records.get(0);
        /* read */ boolean isMapped = record.isMapped("name");
        
        // Output the result
        System.out.println("Is 'name' mapped: " + isMapped);
    }
}