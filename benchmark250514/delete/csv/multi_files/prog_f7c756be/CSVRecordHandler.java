import org.apache.commons.csv.CSVRecord;

public class CSVRecordHandler {
    private CSVRecord record;

    public CSVRecordHandler(CSVRecord record) {
        this.record = record;
    }

    public boolean isHeaderMapped(String header) {
        /* read */ return record.isMapped(header);
    }
}
