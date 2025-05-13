import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Simulating a CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, null, 0, 0);

        /* read */ boolean isConsistent = record.isConsistent();
        System.out.println("Record is consistent: " + isConsistent);
    }
}