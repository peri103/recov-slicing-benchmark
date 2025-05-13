import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with ignoring empty lines
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nDoe,25\n";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get records
            List<CSVRecord> records = parser.getRecords();

            // Read a specific record
            CSVRecord record = records.get(0); // Getting the first record

            // Check if a field is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' field set? " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}