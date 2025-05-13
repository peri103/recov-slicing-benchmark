import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {
    private List<CSVRecord> records;

    public CSVProcessor(List<CSVRecord> records) {
        this.records = records;
    }

    public List<String> extractHeaders() {
        ArrayList<String> headers = new ArrayList<>();
        for (CSVRecord record : records) {
            if (record.getComment() == null) {
                headers.add(record.get(0));
            }
        }
        return headers;
    }

    public String getFirstComment() {
        // Read the comment from the first record
        /* read */ return records.get(0).getComment();
    }

    public List<String> extractValues() {
        ArrayList<String> values = new ArrayList<>();
        for (CSVRecord record : records) {
            for (String value : record) {
                values.add(value);
            }
        }
        return values;
    }
}
