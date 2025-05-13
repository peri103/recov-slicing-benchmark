import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        /* write */
        format = format.withIgnoreEmptyLines(true);

        // Prepare a mock CSV record for reading
        // Since CSVRecord is typically obtained from parsing a CSV file, we simulate it here
        String[] recordValues = {"value1", "value2"};
        CSVRecord record = CSVFormat.DEFAULT.parse(java.util.Arrays.asList(recordValues)).iterator().next();

        /* read */
        boolean isConsistent = record.isConsistent();

        System.out.println(isConsistent);
    }
}