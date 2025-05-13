import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";

        // Create a CSVFormat object with the header
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

        // Parse the CSV data using the format
        CSVParser parser = new CSVParser(new StringReader(csvData), format);

        // Get the records from the parser
        List<CSVRecord> records = parser.getRecords();

        // Read the first record
        CSVRecord firstRecord = records.get(0);

        // Check if the 'Name' field is mapped
        /* read */ boolean isNameMapped = firstRecord.isMapped("Name");

        // Output the result
        System.out.println("Is 'Name' mapped: " + isNameMapped);
    }
}