import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class CSVUtility {
    private CSVFormat format;

    public CSVUtility() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ this.format = this.format.withEscape('\\');
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData)).getRecords();
    }
}
