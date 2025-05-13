import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVDataProcessor {
    private ArrayList<CSVRecord> recordList = new ArrayList<>();

    public void addRecords(List<CSVRecord> records) {
        recordList.addAll(records);
    }

    public HashMap<String, String> processRecords() {
        HashMap<String, String> recordMap = new HashMap<>();
        for (CSVRecord record : recordList) {
            recordMap.put(record.get(0), record.get(1));
        }
        return recordMap;
    }

    public String getFirstRecordComment() {
        /* read */ return recordList.get(0).getComment();
    }
}
