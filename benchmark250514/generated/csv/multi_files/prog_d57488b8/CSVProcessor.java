import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CSVProcessor {
    private List<CSVRecord> records;

    public CSVProcessor(List<CSVRecord> records) {
        this.records = records;
    }

    public void printRecords() {
        if (records != null) {
            for (CSVRecord record : records) {
                String name = record.get(0);
                String age = record.get(1);
                String city = record.get(2);
                System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
            }
        }
    }

    public String getFirstRecordAsString() {
        if (records != null && !records.isEmpty()) {
            /* read */ return records.get(0).toString();
        }
        return null;
    }
}