import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the write class
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase(true);

        // Initialize the read class
        CSVRecord record = CSVRecord.EMPTY;

        // Simulate the record being mapped according to the format
        // For demonstration purposes, assuming the record is mapped as per the format
        boolean isMapped = false;
        if (format.getIgnoreHeaderCase()) {
            isMapped = true;
        }

        /* read */ boolean mappedStatus = record.isMapped();
        System.out.println(mappedStatus);
    }
}