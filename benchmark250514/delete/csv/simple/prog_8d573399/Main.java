import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAutoFlush(true);

        // Simulate a CSV record for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, null, null, null, false);
        /* read */ boolean isMapped = record.isMapped();
        
        System.out.println(isMapped);
    }
}