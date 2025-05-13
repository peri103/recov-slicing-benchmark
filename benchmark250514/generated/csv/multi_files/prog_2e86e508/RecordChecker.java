import org.apache.commons.csv.CSVRecord;

public class RecordChecker {
    public boolean isHeaderMapped(CSVRecord record, String header) {
        /* read */ return record.isMapped(header);
    }
}
