import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data to parse
        String csvData = "name,age\nJohn,30\nJane,25";
        StringReader stringReader = new StringReader(csvData);

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(stringReader).getRecords();

            // Assume we are interested in the first record
            CSVRecord record = records.get(0);

            // Check if the record is consistent
            /* read */ boolean isConsistent = record.isConsistent();

            // Output the result
            System.out.println("Is the record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}