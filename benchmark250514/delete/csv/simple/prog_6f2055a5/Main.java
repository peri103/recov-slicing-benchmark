import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific configuration
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Simulate CSV records for demonstration purposes
        ArrayList<CSVRecord> records = new ArrayList<>();
        records.add(new CSVRecord(null, new String[]{"value1", "value2"}, null, 0, 0));
        records.add(new CSVRecord(null, new String[]{"value3", "value4"}, null, 0, 0));

        // Assume we are checking if a column is set in the first record
        CSVRecord record = records.get(0);
        /* read */ boolean isSet = record.isSet(0);

        System.out.println("Is the first column set in the first record? " + isSet);
    }
}