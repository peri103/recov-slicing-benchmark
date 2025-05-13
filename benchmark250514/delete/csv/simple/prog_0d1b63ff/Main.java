import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format object
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Modify the CSVFormat to allow missing column names
        /* write */ csvFormat = csvFormat.withAllowMissingColumnNames();

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord csvRecord = CSVRecord.parse("value1,value2,value3", csvFormat);

        // Check if a specific column is set
        /* read */ boolean isSet = csvRecord.isSet("value2");

        // Print the result
        System.out.println(isSet);
    }
}