import org.apache.commons.csv.CSVRecord;

public class CommentReader {

    public String readComment(CSVRecord record) {
        /* read */ return record.getComment();
    }
}
