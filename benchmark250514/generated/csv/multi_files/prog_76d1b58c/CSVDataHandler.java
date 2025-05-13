import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class CSVDataHandler {
    private List<CSVRecord> records;

    public CSVDataHandler() {
        records = new ArrayList<>();
    }

    public void parseData(CSVParser parser) throws IOException {
        records.addAll(parser.getRecords());
    }

    public boolean checkFirstRecordConsistency() {
        if (!records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ return record.isConsistent();
        }
        return false;
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
