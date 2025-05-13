import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a CSV string for parsing
            String csvData = "header1, header2\nvalue1, value2";
            Reader input = new StringReader(csvData);

            // Create a CSVFormat instance with trim enabled
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Parse the CSV data using the configured format
            CSVParser parser = new CSVParser(input, format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a header is mapped in the record
            /* read */ boolean isMapped = record.isMapped("header1");
            
            // Output the result
            System.out.println("Is 'header1' mapped: " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}