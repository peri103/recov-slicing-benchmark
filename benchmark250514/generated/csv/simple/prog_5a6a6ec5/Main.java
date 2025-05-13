import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrailingDelimiter();

        // Prepare a CSV input to parse
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";
        
        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Access a specific record and check if a column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("name");
            
            // Output the result
            System.out.println("Is 'name' set in the first record? " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}