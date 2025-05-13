import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object and configure it
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Create a mock CSVRecord to demonstrate the read method
        List<String> recordValues = new ArrayList<>();
        recordValues.add("value1");
        recordValues.add("value2");

        // Create a CSVRecord using the CSVFormat (mocked)
        CSVRecord csvRecord = new CSVRecord(recordValues, null, 0, 0);

        // Check if a specific header is mapped
        /* read */ boolean isMapped = csvRecord.isMapped("header1");
        System.out.println(isMapped);
    }
}