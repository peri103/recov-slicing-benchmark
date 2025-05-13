import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class RecordProcessor {
    private List<CSVRecord> records;

    public RecordProcessor(List<CSVRecord> records) {
        this.records = records;
    }

    public List<String> extractNames() {
        List<String> names = new ArrayList<>();
        for (CSVRecord record : records) {
            names.add(record.get(0)); // Assume the first column is the name
        }
        return names;
    }

    public String getFirstRecordString() {
        CSVRecord firstRecord = records.get(0);
        /* read */ return firstRecord.toString();
    }
}
