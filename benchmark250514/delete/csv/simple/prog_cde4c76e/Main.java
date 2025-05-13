import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Create a dummy CSVRecord
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        CSVRecord record = new CSVRecord(values, null, format);

        // Read the consistency of the CSVRecord
        /* read */ boolean isConsistent = record.isConsistent();
        System.out.println(isConsistent);
    }
}