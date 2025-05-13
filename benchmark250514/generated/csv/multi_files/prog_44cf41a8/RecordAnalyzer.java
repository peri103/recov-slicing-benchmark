import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class RecordAnalyzer {
    private List<CSVRecord> records;

    public RecordAnalyzer(List<CSVRecord> records) {
        this.records = records;
    }

    public void analyzeRecords() {
        for (CSVRecord record : records) {
            System.out.println("Analyzing record for: " + record.get(0));
        }
    }

    public boolean checkConsistency(int index) {
        /* read */ return records.get(index).isConsistent();
    }
}
