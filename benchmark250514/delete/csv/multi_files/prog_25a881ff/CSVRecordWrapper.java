import org.apache.commons.csv.CSVRecord;

public class CSVRecordWrapper {
    private CSVRecord record;

    public CSVRecordWrapper(CSVRecord record) {
        this.record = record;
    }

    public boolean checkHeaderMapped(String headerName) {
        /* read */ return record.isMapped(headerName);
    }
}
