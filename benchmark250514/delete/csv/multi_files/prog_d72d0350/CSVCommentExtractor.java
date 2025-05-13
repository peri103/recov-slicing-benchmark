import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;

public class CSVCommentExtractor {
    public String extractComment(CSVParser parser) {
        try {
            for (CSVRecord record : parser) {
                String comment = /* read */ record.getComment();
                if (comment != null) {
                    return comment; // Return the comment
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
