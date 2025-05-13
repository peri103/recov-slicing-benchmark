import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ this.format = this.format.withIgnoreSurroundingSpaces();
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData)).getRecords();
    }
}