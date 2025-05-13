import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        this.format = CSVFormat.DEFAULT;
    }

    public void setDelimiter(char delimiter) {
        /* write */ this.format = this.format.withDelimiter(delimiter);
    }

    public List<CSVRecord> parseCSV(String csvData) {
        List<CSVRecord> records = null;
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records;
    }
}