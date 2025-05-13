import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Simulate creating a CSVRecord with the format
        String[] values = {"value1", "NULL", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(values).getRecords().get(0);

        /* read */ boolean isSet = record.isSet("value1");
        System.out.println(isSet);
    }
}