import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object with the desired configuration
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, format);

        // Read the value using the isConsistent method
        /* read */ boolean isConsistent = record.isConsistent();

        // Print the result
        System.out.println("Is the CSV record consistent? " + isConsistent);
    }
}