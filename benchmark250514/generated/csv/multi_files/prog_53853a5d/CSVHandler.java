import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;

    public CSVHandler() {
        /* write */ this.csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        StringReader reader = new StringReader(csvData);
        return csvFormat.parse(reader).getRecords();
    }
}
