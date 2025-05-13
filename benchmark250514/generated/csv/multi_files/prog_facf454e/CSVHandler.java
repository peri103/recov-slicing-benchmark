import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ format = format.withCommentMarker('#');
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData)).getRecords();
    }
}
