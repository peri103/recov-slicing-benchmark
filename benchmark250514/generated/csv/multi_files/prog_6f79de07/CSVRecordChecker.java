import org.apache.commons.csv.CSVRecord;

public class CSVRecordChecker {
    public boolean isColumnSet(CSVRecord record, String columnName) {
        /* read */ return record.isSet(columnName);
    }
}
