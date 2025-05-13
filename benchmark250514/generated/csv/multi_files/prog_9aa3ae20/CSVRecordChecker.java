import org.apache.commons.csv.CSVRecord;

public class CSVRecordChecker {
    public boolean checkConsistency(CSVRecord record) {
        if (record != null) {
            /* read */ return record.isConsistent();
        }
        return false;
    }
}
