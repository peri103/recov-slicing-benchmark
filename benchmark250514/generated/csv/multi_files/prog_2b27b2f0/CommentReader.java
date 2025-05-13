import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

public class CommentReader {

    public String readComment(String data) {
        String comment = null;
        try {
            Reader reader = new StringReader(data);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
            for (CSVRecord record : records) {
                /* read */ comment = record.getComment();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return comment;
    }
}
