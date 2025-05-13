import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trimming enabled
        CSVFormat format = CSVFormat.DEFAULT.withTrim();

        // Create a CSVRecord for demonstration purposes
        // Normally, CSVRecord is obtained by parsing CSV data
        // Here we simulate a record with two fields: " Name " and " Age "
        String[] recordData = {" Name ", " Age "};
        CSVRecord record = CSVFormat.DEFAULT.parse(Arrays.asList(recordData)).getRecords().get(0);

        /* write */ format = format.withTrim();

        // Check if a field is mapped
        /* read */ boolean isMapped = record.isMapped("Name");

        // Output the result
        System.out.println("Is 'Name' mapped: " + isMapped);
    }
}