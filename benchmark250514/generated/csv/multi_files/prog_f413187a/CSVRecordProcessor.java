import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CSVRecordProcessor {
    private List<CSVRecord> records;

    public CSVRecordProcessor(List<CSVRecord> records) {
        this.records = records;
    }

    public void printRecords() {
        for (CSVRecord record : records) {
            String name = record.get("Name");
            String age = record.get("Age");
            String city = record.get("City");
            System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
        }
    }

    public boolean checkConsistency(int index) {
        if (index < records.size()) {
            /* read */ return records.get(index).isConsistent();
        }
        return false;
    }
}
