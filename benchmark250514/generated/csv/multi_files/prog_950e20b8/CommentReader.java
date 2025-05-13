import org.apache.commons.csv.CSVRecord;

public class CommentReader {
    private CSVRecord record;

    public CommentReader(CSVRecord record) {
        this.record = record;
    }

    public String readComment() {
        /* read */ return record.getComment();
    }
}
