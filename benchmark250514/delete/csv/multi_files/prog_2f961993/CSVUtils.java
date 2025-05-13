import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CSVUtils {
    public boolean checkMapping(CSVRecord record, String columnName) {
        /* read */ return record.isMapped(columnName);
    }
}
