import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat and apply the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Mock a CSVRecord to demonstrate the read method
        CSVRecord record = new CSVRecord(null, null, format, 0, null);

        // Check if the record is mapped
        /* read */ boolean isMapped = record.isMapped();
        System.out.println(isMapped);
    }
}