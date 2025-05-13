import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void initializeFormat() {
        /* write */ format = format.withHeaderComments("This is a comment");
    }

    public CSVRecord createRecord() {
        List<String> recordValues = Arrays.asList("value1", "value2");
        return new CSVRecord(format, recordValues, null, 0, 0);
    }
}
