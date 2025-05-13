import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler() {
        // Initialize CSVFormat with header comments
        format = CSVFormat.DEFAULT
            /* write */ .withHeaderComments("This is a header comment");
    }

    public void parseCSV(String csvData) throws IOException {
        // Parse the CSV data using the format
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
