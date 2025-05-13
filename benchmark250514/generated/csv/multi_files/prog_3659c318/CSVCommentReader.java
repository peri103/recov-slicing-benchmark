import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVCommentReader {
    public String readComment(String csvData) {
        StringReader reader = new StringReader(csvData);
        String comment = "";
        try {
            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();
            if (!records.isEmpty()) {
                CSVRecord csvRecord = records.get(0);
                /* read */ comment = csvRecord.getComment();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return comment;
    }
}
