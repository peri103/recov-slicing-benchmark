import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method withTrim() to modify the format
        /* write */ format = format.withTrim();

        // Simulate a CSVRecord object for reading
        CSVRecord record = new CSVRecord(null, null, null, format);

        // Use the read method isMapped() to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped();
        
        // Print the result
        System.out.println("Is the record mapped? " + isMapped);
    }
}