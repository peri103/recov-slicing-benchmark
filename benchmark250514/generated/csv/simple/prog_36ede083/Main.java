import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with missing column names allowed
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = ",header2\nvalue1,value2";

            // Parse the CSV data using the format
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Get the first record
            CSVRecord record = records.iterator().next();

            // Check if the record is consistent
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println(isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}