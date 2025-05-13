import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class CommentExtractor {
    public List<String> extractComments(List<CSVRecord> records) {
        ArrayList<String> extractedComments = new ArrayList<>();
        for (CSVRecord record : records) {
            String comment = record.getComment();
            if (comment != null) {
                extractedComments.add(comment);
            }
        }
        return extractedComments;
    }
}
