import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object and configure it to ignore header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Simulate CSVRecord creation
        List<String> headers = new ArrayList<>();
        headers.add("Name");
        headers.add("Age");

        List<String> values = new ArrayList<>();
        values.add("John Doe");
        values.add("30");

        CSVRecord record = new CSVRecord(values, headers, 0, 0);

        // Check if a specific header is mapped
        /* read */ boolean isMapped = record.isMapped("name"); // should be true due to ignore header case
        System.out.println(isMapped);
    }
}