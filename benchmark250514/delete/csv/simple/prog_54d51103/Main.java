import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, null, format);

        /* read */ boolean isConsistent = record.isConsistent();
        System.out.println("Is the record consistent? " + isConsistent);
    }
}