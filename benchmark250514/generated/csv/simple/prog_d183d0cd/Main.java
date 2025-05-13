import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ format = format.withTrim();
        
        // Assume we have a CSVRecord instance for demonstration purposes
        CSVRecord record = null;  // Normally, you would obtain this from parsing a CSV file
        
        // Use the read method
        if (record != null) {
            /* read */ boolean isMapped = record.isMapped("exampleColumn");
            System.out.println(isMapped);
        } else {
            System.out.println("CSVRecord is not initialized.");
        }
    }
}