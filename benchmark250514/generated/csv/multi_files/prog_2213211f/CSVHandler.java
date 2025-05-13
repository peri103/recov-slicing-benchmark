import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void addHeaderComment(String comment) {
        /* write */ format = format.withHeaderComments(comment);
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();
        parser.close();
        return records;
    }
}
