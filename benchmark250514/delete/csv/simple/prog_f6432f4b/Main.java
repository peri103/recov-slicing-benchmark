import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat object
        /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

        // Create a CSVRecord object for demonstration purposes
        CSVRecord csvRecord = new CSVRecord(null, new String[]{"value"}, csvFormat);

        // Use the read method to check if a certain column is set
        /* read */ boolean isSet = csvRecord.isSet(0);

        // Output the result
        System.out.println("Is column set: " + isSet);
    }
}