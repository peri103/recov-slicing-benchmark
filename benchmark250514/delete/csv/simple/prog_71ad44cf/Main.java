import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format instance
        /* write */ format = format.withTrim();

        // Simulate reading a record using CSVRecord (normally obtained by parsing CSV data)
        CSVRecord record = new CSVRecord(format, new String[]{"value"}, null, 0, 0);

        // Use the read method on CSVRecord
        /* read */ boolean isMapped = record.isMapped("value");

        // Output the result
        System.out.println(isMapped);
    }
}