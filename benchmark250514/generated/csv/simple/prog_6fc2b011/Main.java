import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSV format with ignoring empty lines
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
            
            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the first record to check consistency
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            
            System.out.println("Is the first record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}