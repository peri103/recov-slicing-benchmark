import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing missing column names
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is consistent
            /* read */ boolean isConsistent = record.isConsistent();

            System.out.println("Is the record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}