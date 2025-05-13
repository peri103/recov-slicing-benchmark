import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class DataAnalyzer {
    public int calculateTotalAge(List<CSVRecord> records) {
        int totalAge = 0;
        for (CSVRecord record : records) {
            totalAge += Integer.parseInt(record.get(1));
        }
        return totalAge;
    }

    public String getFirstRecordAsString(List<CSVRecord> records) {
        /* read */ return records.get(0).toString();
    }
}
