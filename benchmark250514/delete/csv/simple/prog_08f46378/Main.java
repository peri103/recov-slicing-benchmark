import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific configuration
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Simulate a CSVRecord with some data
        Map<String, String> data = new HashMap<>();
        data.put("Header", "Value");
        CSVRecord csvRecord = new CSVRecord(data, null, null, 0, null);

        // Check if a header is mapped, considering the CSVFormat configuration
        /* read */ boolean isMapped = csvRecord.isMapped("header");
        System.out.println(isMapped);
    }
}