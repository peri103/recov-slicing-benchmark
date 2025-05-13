import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing duplicate header names
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Create a CSVRecord for demonstration
        String[] values = {"value1", "value2"};
        String[] headers = {"header1", "header2"};
        CSVRecord record = new CSVRecord(null, values, headers, null, null);

        // Check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("header1");
        System.out.println(isMapped);
    }
}