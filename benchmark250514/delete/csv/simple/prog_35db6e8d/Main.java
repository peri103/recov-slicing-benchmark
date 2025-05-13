import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Create a mock CSVRecord for demonstration purposes
        // In a real scenario, CSVRecord would be obtained from parsing a CSV file
        CSVRecord csvRecord = new CSVRecord(null, new String[]{"header1", "header2"}, null, null);

        // Use the read method to check if the record is mapped
        /* read */ boolean isMapped = csvRecord.isMapped("header1");
        System.out.println("Is 'header1' mapped: " + isMapped);
    }
}