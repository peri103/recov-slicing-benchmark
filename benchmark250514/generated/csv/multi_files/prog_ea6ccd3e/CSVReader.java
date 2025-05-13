import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class CSVReader {
    public String readComment(String csvData) throws IOException {
        StringReader reader = new StringReader(csvData);
        List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();
        String comment = null;
        for (CSVRecord record : records) {
            /* read */ comment = record.getComment();
            break; // Ensure the read method is executed only once
        }
        return comment;
    }
}
