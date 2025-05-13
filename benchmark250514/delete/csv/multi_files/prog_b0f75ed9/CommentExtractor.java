import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class CommentExtractor {

    public String extractComment(List<CSVRecord> records) {
        // Assuming the comment is in the first record (as per the sample data)
        /* read */ return records.get(0).getComment();
    }
}
