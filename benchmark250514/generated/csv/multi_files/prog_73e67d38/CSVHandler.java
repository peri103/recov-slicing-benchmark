import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws IOException {
        // Initialize CSVFormat with header comments
        this.format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        this.records = parser.getRecords();
        parser.close();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
