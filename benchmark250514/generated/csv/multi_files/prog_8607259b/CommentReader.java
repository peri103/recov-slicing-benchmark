import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CommentReader {
    public String readComment(String csvContent) throws IOException {
        StringReader reader = new StringReader(csvContent);
        List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();

        String comment = null;
        for (CSVRecord record : records) {
            comment = /* read */ record.getComment();
            if (comment != null) break;
        }
        return comment;
    }
}