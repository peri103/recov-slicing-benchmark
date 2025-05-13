import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Simulate a CSVRecord for demonstration purposes
        String[] values = {"value1", "value2"};
        CSVRecord record = CSVRecord.parse(values, format);

        /* read */ boolean isSet = record.isSet(0);
        System.out.println(isSet);
    }
}