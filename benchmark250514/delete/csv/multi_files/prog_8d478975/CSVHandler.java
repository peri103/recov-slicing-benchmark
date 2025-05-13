import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) {
        /* write */ csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
