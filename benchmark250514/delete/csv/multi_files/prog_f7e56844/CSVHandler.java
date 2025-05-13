import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class CSVHandler {
    private CSVFormat format;
    private CSVRecord record;

    public CSVHandler() {
        // Initialize CSVFormat with a null string representation
        format = CSVFormat.DEFAULT.withNullString("NULL");
        // Create a CSVRecord for demonstration purposes
        record = new CSVRecord(null, Arrays.asList("value1", null, "value3"), format, 0, 0);
    }

    public void setNullString(String nullString) {
        /* write */ format = format.withNullString(nullString);
    }

    public CSVRecord getRecord() {
        return record;
    }
}
