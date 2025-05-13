import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize a CSV string
        String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

        // Create a CSVFormat instance and configure it
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

        // Parse the CSV data using the format
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

        // Retrieve the records
        List<CSVRecord> records = parser.getRecords();

        // Access the first record
        CSVRecord record = records.get(0);

        // Check if a specific column is mapped
        /* read */ boolean isMapped = record.isMapped("Name");

        // Output the result
        System.out.println("Is 'Name' mapped: " + isMapped);
    }
}