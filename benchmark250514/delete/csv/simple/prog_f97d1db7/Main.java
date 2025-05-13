import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowMissingColumnNames(true);

        // Simulate a CSVRecord for demonstration purposes
        CSVRecord csvRecord = new CSVRecord(null, new String[]{"value1", "value2"}, null, 0, 0);

        /* read */ boolean isConsistent = csvRecord.isConsistent();
        System.out.println(isConsistent);
    }
}