import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();

        // Simulate a CSVRecord for demonstration
        CSVRecord record = new CSVRecord(null, null, null, format);

        // Use the read method
        /* read */ boolean isMapped = record.isMapped("header");
        
        System.out.println(isMapped);
    }
}