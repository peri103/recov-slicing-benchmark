import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing duplicate header names
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Simulate a CSVRecord (normally this would be obtained from parsing a CSV file)
        CSVRecord record = new CSVRecord(null, null, format, 0, false);

        // Check if the record is mapped
        /* read */ boolean isMapped = record.isMapped();
        
        // Output the result
        System.out.println(isMapped);
    }
}