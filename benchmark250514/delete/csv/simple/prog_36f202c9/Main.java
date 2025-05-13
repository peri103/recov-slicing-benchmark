import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with headers
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withHeader("Name", "Age", "Country");

        // Create a mock CSVRecord for demonstration purposes
        String[] values = {"John Doe", "30", "USA"};
        CSVRecord csvRecord = new CSVRecord(null, values, csvFormat.getHeaderMap(), 0, 0);

        // Check if a specific header is set in the record
        /* read */ boolean isSet = csvRecord.isSet("Age");
        System.out.println("Is 'Age' set: " + isSet);
    }
}