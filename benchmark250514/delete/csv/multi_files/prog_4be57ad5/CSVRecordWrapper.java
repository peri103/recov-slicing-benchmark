import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.util.Arrays;

public class CSVRecordWrapper {
    private CSVRecord record;

    public CSVRecordWrapper(CSVFormatWrapper formatWrapper) {
        String[] data = {"value1", "value2"};
        try {
            CSVParser parser = formatWrapper.getFormat().parse(Arrays.asList(data));
            this.record = parser.iterator().next();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isColumnSet(int index) {
        /* read */ return this.record.isSet(index);
    }
}
