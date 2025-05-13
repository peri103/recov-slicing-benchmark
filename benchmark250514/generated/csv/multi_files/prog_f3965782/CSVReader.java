import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CSVReader {
    private List<CSVRecord> records;

    public CSVReader(List<CSVRecord> records) {
        this.records = records;
    }

    public String readCommentFromFirstRecord() {
        CSVRecord firstRecord = records.get(0);
        /* read */ return firstRecord.getComment();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
