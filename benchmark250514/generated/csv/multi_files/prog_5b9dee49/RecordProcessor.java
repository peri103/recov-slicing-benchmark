import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class RecordProcessor {
    public void processRecords(List<CSVRecord> records) {
        for (CSVRecord record : records) {
            System.out.println("Processing record: " + record);
        }
    }

    public String getFirstRecordString(List<CSVRecord> records) {
        /* read */ return records.get(0).toString();
    }
}
