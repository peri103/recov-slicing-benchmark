import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CommentReader {
    private List<CSVRecord> records;

    public CommentReader(List<CSVRecord> records) {
        this.records = records;
    }

    public String getFirstComment() {
        /* read */ return records.get(0).getComment();
    }
}
