import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;
    private List<CSVRecord> records;

    public CSVHandler() {
        // Initialize CSVFormat with the write method
        /* write */ csvFormat = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
    }

    public void parseCSV(String csvData) throws Exception {
        records = csvFormat.parse(new StringReader(csvData)).getRecords();
    }

    public CSVRecord getFirstRecord() {
        return records.get(0);
    }
}
