import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it using the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

            // Prepare a sample CSV data to parse
            String csvData = "name,age\nJohn,30\nJane,\nDoe,25";

            // Parse the CSV data using the configured format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Use the read method to check consistency of a record
            /* read */ boolean isConsistent = records.get(1).isConsistent();
            
            // Output the result
            System.out.println("Record is consistent: " + isConsistent);
            
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}