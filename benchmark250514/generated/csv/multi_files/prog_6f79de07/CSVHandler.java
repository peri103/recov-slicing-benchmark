import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;

    public CSVHandler() {
        csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withTrailingDelimiter();
    }

    public List<CSVRecord> parseCSV(String csvData) {
        try {
            return csvFormat.parse(new StringReader(csvData)).getRecords();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
