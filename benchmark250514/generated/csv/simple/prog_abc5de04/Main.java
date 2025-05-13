import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a custom delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');
        
        // Sample CSV data
        String csvData = "name;age;location\nJohn;30;New York";
        
        try {
            // Parse the CSV data using the format with the custom delimiter
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));
            
            // Read the first record and convert it to a string
            CSVRecord record = records.iterator().next();
            /* read */ String value = record.toString();
            
            // Output the result
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}