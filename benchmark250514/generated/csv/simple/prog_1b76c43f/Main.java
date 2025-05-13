import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');
        
        // Sample CSV data
        String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";
        
        // Parse CSV data using the format with the specified delimiter
        try {
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Read the first record and convert it to String
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}