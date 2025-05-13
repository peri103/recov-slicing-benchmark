import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

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

            // Additional complexity: process the records and store names in a list
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get(0));
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

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