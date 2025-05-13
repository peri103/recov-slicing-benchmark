import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Sample CSV data
        String csvData = "Name,Age,City\nJohn,30,New York\nJane,25,Los Angeles";

        // Create CSVFormat instance with the first record as header
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

        // Parse the CSV data
        CSVParser parser = new CSVParser(new StringReader(csvData), format);

        // Get the records
        List<CSVRecord> records = parser.getRecords();

        // Access the first record
        CSVRecord record = records.get(0);

        // Check if a specific header is mapped
        /* read */ boolean isMapped = record.isMapped("Name");
        
        // Output the result
        System.out.println("Is 'Name' mapped: " + isMapped);
    }
}