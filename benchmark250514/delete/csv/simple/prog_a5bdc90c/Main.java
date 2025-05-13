import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Simulating a CSVRecord with the format to ensure read method works
        CSVRecord record = new CSVRecord(format, new String[]{"data"}, null, 0, 0);
        /* read */ boolean isConsistent = record.isConsistent();

        System.out.println("Is record consistent: " + isConsistent);
    }
}