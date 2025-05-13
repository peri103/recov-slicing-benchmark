import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CSVDataProcessor {
    private List<CSVRecord> records;

    public CSVDataProcessor(List<CSVRecord> records) {
        this.records = records;
    }

    public boolean checkFirstRecordConsistency() {
        if (records.isEmpty()) {
            return false;
        }
        CSVRecord record = records.get(0);
        /* read */ return record.isConsistent();
    }

    public int calculateTotalAge() {
        int totalAge = 0;
        for (CSVRecord rec : records) {
            totalAge += Integer.parseInt(rec.get(1)); // Assuming age is at index 1
        }
        return totalAge;
    }
}
