import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CSVCommentReader {
    private List<CSVRecord> csvRecords;

    public CSVCommentReader(List<CSVRecord> csvRecords) {
        this.csvRecords = csvRecords;
    }

    public String readComment() {
        if (!csvRecords.isEmpty()) {
            /* read */ return csvRecords.get(0).getComment();
        }
        return null;
    }
}
