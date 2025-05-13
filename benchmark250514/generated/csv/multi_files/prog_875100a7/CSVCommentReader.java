import org.apache.commons.csv.CSVRecord;

import java.util.List;

public class CSVCommentReader {

    public String readComment(List<CSVRecord> records) {
        if (records.isEmpty()) {
            return null;
        }
        CSVRecord record = records.get(0);
        /* read */ return record.getComment();
    }
}
