import org.apache.commons.csv.CSVRecord;

public class CSVRecordValidator {
    private CSVRecord record;

    public CSVRecordValidator(CSVRecord record) {
        this.record = record;
    }

    public boolean isRecordMapped() {
        /* read */ return record.isMapped();
    }

    public boolean isRecordValid() {
        for (String field : record) {
            if (field == null || field.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
