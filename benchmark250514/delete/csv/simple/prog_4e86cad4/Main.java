import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Simulating a CSVRecord for demonstration purposes
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, values, null, 0, 0);

        /* read */ boolean isSet = record.isSet(0);
        System.out.println(isSet);
    }
}