import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');
    }

    public List<CSVRecord> parseCSV(String csvData) throws Exception {
        return format.parse(new StringReader(csvData)).getRecords();
    }
}
