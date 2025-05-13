import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessor {
    private Map<String, String> dataMap = new HashMap<>();

    public void processRecords(List<CSVRecord> records) {
        for (CSVRecord record : records) {
            String header1Value = record.get("header1");
            String header2Value = record.get("header2");
            dataMap.put(header1Value, header2Value);
        }
    }

    public void printDataMap() {
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
