import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignoring empty lines
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

        // Sample data to test reading
        List<String> data = Arrays.asList("Name, Age", "Alice, 30", "", "Bob, 25");

        // Parse the sample data using CSVFormat
        List<CSVRecord> records = null;
        try {
            records = format.parse(new java.io.StringReader(String.join("\n", data))).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Ensure that we have records to read
        if (records != null && !records.isEmpty()) {
            // Read the first record and check if a field is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' field set in the first record? " + isSet);
        }
    }
}