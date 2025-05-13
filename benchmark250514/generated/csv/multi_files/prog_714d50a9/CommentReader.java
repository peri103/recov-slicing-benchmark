import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CommentReader {

    public String readComment(String data) {
        try {
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new StringReader(data)).getRecords();
            for (CSVRecord record : records) {
                if (record.getComment() != null) {
                    /* read */ return record.getComment();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
