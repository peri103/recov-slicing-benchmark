import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignore header case
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Simulate a CSVRecord
        List<String> headers = Arrays.asList("Name", "Age", "Country");
        List<String> values = Arrays.asList("Alice", "30", "USA");
        CSVRecord record = new CSVRecord(null, values.toArray(new String[0]), headers.toArray(new String[0]), 0, 0);

        // Check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("name");
        System.out.println(isMapped);
    }
}