import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;
    private List<CSVRecord> consistentRecords = new ArrayList<>();

    public CSVHandler() {
        // Initialize CSVFormat with the write method
        /* write */ csvFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines();
    }

    public void parseCSV(String csvData) throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

        for (CSVRecord record : parser) {
            boolean isConsistent = record.isConsistent();
            if (isConsistent) {
                consistentRecords.add(record);
            }
        }

        parser.close();
    }

    public List<CSVRecord> getConsistentRecords() {
        return consistentRecords;
    }
}
