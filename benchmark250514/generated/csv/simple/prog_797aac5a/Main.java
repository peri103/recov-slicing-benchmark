import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSV format and apply the 'withTrim' method
            CSVFormat format = CSVFormat.DEFAULT.withTrim(); /* write */

            // Prepare a sample CSV input
            String csvData = "header1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Read the first record and check if a header is mapped
            CSVRecord record = records.get(0);
            boolean isMapped = record.isMapped("header1"); /* read */

            // Output the result
            System.out.println("Is 'header1' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}