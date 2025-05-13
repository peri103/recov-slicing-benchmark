import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignoring header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, format);

        // Check if the record is mapped
        /* read */ boolean isMapped = record.isMapped();
        System.out.println(isMapped);
    }
}