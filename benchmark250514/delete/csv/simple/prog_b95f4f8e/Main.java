import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a list to simulate CSV records
        List<CSVRecord> records = new ArrayList<>();

        // Create a CSVFormat object and configure it
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

        // Add a dummy CSVRecord to the list for demonstration
        CSVRecord record = new CSVRecord(null, null, 0, 0);
        records.add(record);

        // Read from the first record to check if a column is set
        /* read */ boolean isSet = records.get(0).isSet(0);
        System.out.println(isSet);
    }
}