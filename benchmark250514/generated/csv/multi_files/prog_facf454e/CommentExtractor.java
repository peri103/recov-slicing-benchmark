import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CommentExtractor {
    public String extractComment(List<CSVRecord> records) {
        /* read */ return records.get(0).getComment();
    }
}
