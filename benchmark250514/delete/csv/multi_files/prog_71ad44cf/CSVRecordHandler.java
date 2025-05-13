import org.apache.commons.csv.CSVRecord;

public class CSVRecordHandler {
    private CSVRecord record;

    public CSVRecordHandler(CSVFormat format) {
        this.record = new CSVRecord(format, new String[]{"value"}, null, 0, 0);
    }

    public boolean isFieldMapped(String fieldName) {
        /* read */ return record.isMapped(fieldName);
    }
}
