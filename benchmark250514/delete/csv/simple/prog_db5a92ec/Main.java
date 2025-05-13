import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase(true);

        // Create a sample CSVRecord for testing the read method
        String[] headers = {"Name", "Age"};
        String[] values = {"John Doe", "30"};
        CSVRecord record = CSVFormat.DEFAULT.parse(Arrays.asList(values)).getRecords().get(0);

        // Check if a header is mapped using the read method
        /* read */ boolean isMapped = record.isMapped("name");
        System.out.println(isMapped);
    }
}