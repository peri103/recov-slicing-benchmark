import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Simulating a CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, new String[]{"value1", "NULL", "value3"}, null, null);

        /* read */ boolean isSet = record.isSet("value1");
        System.out.println(isSet);
    }
}