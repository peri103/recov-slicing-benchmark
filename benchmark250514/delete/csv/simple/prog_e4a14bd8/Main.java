import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the format object
        /* write */ format = format.withTrim();

        // Create a CSVRecord object for demonstration purposes
        // Normally, CSVRecord would be obtained by parsing a CSV file using CSVParser
        // Here, we simulate a CSVRecord with a simple example
        CSVRecord record = new CSVRecord(null, new String[]{"header1", "header2"}, new String[]{"value1", "value2"}, 0, 0);

        // Use the read method to check if a specific header is mapped
        /* read */ boolean isMapped = record.isMapped("header1");

        // Print the result
        System.out.println("Is 'header1' mapped: " + isMapped);
    }
}