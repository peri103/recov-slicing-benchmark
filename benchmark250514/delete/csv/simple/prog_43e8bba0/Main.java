import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignoring header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Create a mock CSVRecord to demonstrate isMapped
        CSVRecord record = new CSVRecord(null, new String[]{"Header1", "Header2"}, null, 0, 0);

        // Check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("header1");
        System.out.println(isMapped);
    }
}