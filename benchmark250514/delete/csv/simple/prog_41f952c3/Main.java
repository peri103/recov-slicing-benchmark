import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat and set allow missing column names
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Create a sample CSVRecord
        List<String> values = Arrays.asList("value1", "value2", "value3");
        CSVRecord record = new CSVRecord(values, null, format, 0, 0);

        // Read a value from CSVRecord
        /* read */ boolean isSet = record.isSet(1); // Check if the second column is set
        System.out.println("Is column set: " + isSet);
    }
}