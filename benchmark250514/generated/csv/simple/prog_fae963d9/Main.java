import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with allowing missing column names
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Get the first record
            CSVRecord record = records.iterator().next();

            // Check if a field is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' field set: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}