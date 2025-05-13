import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withTrim();
        
        // Create a CSVRecord object with a dummy record for demonstration purposes
        // Normally, CSVRecord is obtained from parsing a CSV file, but here we will simulate it.
        CSVRecord record = new CSVRecord(null, null, format, 0, 0);
        
        // Use the read method to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped("someHeader");
        
        // Print the result
        System.out.println("Is the record mapped? " + isMapped);
    }
}