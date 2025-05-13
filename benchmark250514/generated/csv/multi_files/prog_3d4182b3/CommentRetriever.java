import org.apache.commons.csv.CSVRecord;

public class CommentRetriever {

    public String retrieveComment(CSVRecord record) {
        /* read */ return record.getComment();
    }
}
