import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Create a sample CSV string
            String csvData = "name,age\nAlice,30\nBob,25";

            // Parse the CSV string using the format
            List<CSVRecord> records = format.parse(new java.io.StringReader(csvData)).getRecords();

            // Use the read method on a CSVRecord
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();

            // Output the result
            System.out.println("Is the record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}