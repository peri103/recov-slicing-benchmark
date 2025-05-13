import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Use write method
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Simulate CSVRecord object
        CSVRecord csvRecord = new CSVRecord(null, null, csvFormat);

        // Use read method
        /* read */ boolean isMapped = csvRecord.isMapped("someHeader");

        // Output the result
        System.out.println(isMapped);
    }
}