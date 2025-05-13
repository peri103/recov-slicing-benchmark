import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;

    public CSVHandler() {
        this.csvFormat = CSVFormat.DEFAULT;
    }

    public void configureCSVFormat() {
        /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return csvFormat.parse(new StringReader(csvData)).getRecords();
    }
}
