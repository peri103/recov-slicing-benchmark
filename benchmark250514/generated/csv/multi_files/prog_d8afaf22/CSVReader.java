import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class CSVReader {
    public String readComment(String csvData) throws IOException {
        List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(new java.io.StringReader(csvData)).getRecords();
        CSVRecord record = records.get(0);
        /* read */ return record.getComment();
    }
}
