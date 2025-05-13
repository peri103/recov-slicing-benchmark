import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Simulating a CSV record for demonstration purposes
        String[] data = {"value1", "NULL", "value3"};
        CSVRecord record = CSVRecord.parse(Arrays.asList(data), format);

        /* read */ boolean isSet = record.isSet("NULL");
        System.out.println(isSet);
    }
}