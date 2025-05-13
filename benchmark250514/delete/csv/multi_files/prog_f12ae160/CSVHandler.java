import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws IOException {
        // Initialize CSVFormat with the method to ignore header case
        /* write */ csvFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase();
        CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
        records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
