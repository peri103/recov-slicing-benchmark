import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trimming
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrim();

        // Create a CSVRecord for demonstration purposes
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, values, null, 0, format);

        // Check if a column is mapped
        /* read */ boolean isMapped = record.isMapped("value1");
        System.out.println(isMapped);
    }
}