import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class CSVAnalyzer {
    private List<CSVRecord> records;

    public CSVAnalyzer(List<CSVRecord> records) {
        this.records = records;
    }

    public List<String> extractNames() {
        List<String> names = new ArrayList<>();
        for (CSVRecord record : records) {
            names.add(record.get("Name"));
        }
        return names;
    }

    public boolean isNameMapped(CSVRecord record) {
        return record.isMapped("Name"); // /* read */
    }
}
