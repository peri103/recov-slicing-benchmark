import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CSVFormat
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to configure the format
        /* write */ format = format.withTrim();

        // Simulate the creation of a CSVRecord with the format applied
        // Note: CSVRecord is typically obtained by parsing a CSV file with CSVParser,
        // but since we are not doing file operations, we'll simulate it.
        // Assume we have a CSVRecord instance
        CSVRecord record = new CSVRecord(null, null, null, format);

        // Use the read method to check if a record is mapped
        /* read */ boolean isMapped = record.isMapped("columnName");

        System.out.println("Is column mapped: " + isMapped);
    }
}