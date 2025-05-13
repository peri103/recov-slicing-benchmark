import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class CSVRecordHandler {
    private CSVRecord record;

    public CSVRecordHandler(CSVFormatHandler formatHandler) {
        record = new CSVRecord(null, Arrays.asList("Header1", "Header2"), null, formatHandler.getFormat());
    }

    public boolean isHeaderMapped(String header) {
        /* read */ return record.isMapped(header);
    }
}
