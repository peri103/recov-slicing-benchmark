import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object and configure it using the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Simulate a CSVRecord with headers to test the read method
        List<String> headers = Arrays.asList("Name", "Age", "Location");
        List<String> values = Arrays.asList("John Doe", "30", "New York");
        CSVRecord record = new CSVRecord(null, values, headers, 0, values.size());

        // Use the read method to check if the field is mapped
        /* read */ boolean isMapped = record.isMapped("name");
        System.out.println(isMapped);
    }
}