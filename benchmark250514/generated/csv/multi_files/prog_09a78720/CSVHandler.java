import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        // Initialize CSVFormat with header comments
        format = CSVFormat.DEFAULT
            /* write */ .withHeaderComments("This is a comment");
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        return parser.getRecords();
    }
}
