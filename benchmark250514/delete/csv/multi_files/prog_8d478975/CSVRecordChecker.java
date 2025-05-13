import org.apache.commons.csv.CSVRecord;

public class CSVRecordChecker {
    private CSVRecord record;

    public CSVRecordChecker(CSVRecord record) {
        this.record = record;
    }

    public boolean isNameMapped() {
        /* read */ return record.isMapped("Name");
    }
}
