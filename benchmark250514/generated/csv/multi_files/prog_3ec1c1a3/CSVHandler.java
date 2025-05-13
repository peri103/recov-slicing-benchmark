import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.Iterator;

public class CSVHandler {
    private CSVFormat format;
    private Iterable<CSVRecord> records;

    public CSVHandler(String csvData) {
        /* write */ format = CSVFormat.DEFAULT.withCommentMarker('#');
        try {
            records = format.parse(new StringReader(csvData));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getComment() {
        Iterator<CSVRecord> iterator = records.iterator();
        CSVRecord record = null;
        while (iterator.hasNext()) {
            record = iterator.next();
            if (record.getComment() != null) {
                break;
            }
        }
        /* read */ return record != null ? record.getComment() : null;
    }
}
