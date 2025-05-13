import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing duplicate header names
        CSVFormat csvFormat = CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(true);

        // Create a CSVRecord for demonstration purposes
        // In a real scenario, this would be populated from a CSV file
        String[] headers = {"header1", "header1", "header2"};
        String[] values = {"value1", "value2", "value3"};
        CSVRecord csvRecord = new CSVRecord(headers, values);

        // Write operation
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Read operation
        /* read */ boolean isSet = csvRecord.isSet("header1");
        
        System.out.println(isSet);
    }
}