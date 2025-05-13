import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to set the format with trim
        /* write */ format = format.withTrim();
        
        // Create a dummy CSVRecord instance for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, null, format);
        
        // Use the read method to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped(0);
        
        // Print the result
        System.out.println("Is the record mapped? " + isMapped);
    }
}