import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a sample CSV input
        String csvData = "Name,Age,Location\nJohn,NULL,USA\nJane,25,NULL";

        // Parse the CSV data using the format
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Location");

            System.out.println("Is 'Location' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}