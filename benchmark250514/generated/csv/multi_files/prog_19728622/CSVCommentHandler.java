import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class CSVCommentHandler {
    private CSVFormat format;

    public CSVCommentHandler() {
        // Initialize CSVFormat with a comment marker
        this.format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(csvData, format);
        return parser.getRecords();
    }
}
