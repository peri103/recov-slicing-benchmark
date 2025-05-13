import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVOperations {
    private CSVFormat format;
    private CSVParser parser;
    private List<CSVRecord> records;

    public CSVOperations(String csvData) throws IOException {
        /* write */ this.format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
        StringReader reader = new StringReader(csvData);
        this.parser = new CSVParser(reader, format);
        this.records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }

    public CSVParser getParser() {
        return parser;
    }

    public void close() throws IOException {
        parser.close();
    }
}
