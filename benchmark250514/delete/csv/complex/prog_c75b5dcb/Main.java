import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the format
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Create a CSVRecord object for demonstration
        CSVRecord record = new CSVRecord(null, new String[]{"header1"}, null, 0, format);

        // Create another CSVFormat with different settings
        CSVFormat format2 = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);

        // Create a list of headers for demonstration
        List<String> headers = Arrays.asList("header1", "header2", "header3");

        // Create another CSVRecord with the second format
        CSVRecord record2 = new CSVRecord(null, headers.toArray(new String[0]), null, 0, format2);

        // Check if headers are mapped in the second record
        boolean isMappedHeader1 = record2.isMapped("header1");
        boolean isMappedHeader2 = record2.isMapped("header2");

        // Output the results
        System.out.println("Record2 - Header1 mapped: " + isMappedHeader1);
        System.out.println("Record2 - Header2 mapped: " + isMappedHeader2);

        // Use the read method to check if a header is mapped in the first record
        /* read */ boolean isMapped = record.isMapped("header1");

        // Output the result for the first record
        System.out.println("Record1 - Header1 mapped: " + isMapped);

        // Additional logic to manipulate CSV records
        for (String header : headers) {
            boolean isMappedInRecord1 = record.isMapped(header);
            boolean isMappedInRecord2 = record2.isMapped(header);
            System.out.println("Header: " + header + ", Record1 mapped: " + isMappedInRecord1 + ", Record2 mapped: " + isMappedInRecord2);
        }
    }
}