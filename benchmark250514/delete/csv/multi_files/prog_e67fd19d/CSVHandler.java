import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class CSVHandler {
    private CSVFormat format;
    private Map<String, CSVRecord> recordMap = new HashMap<>();

    public CSVHandler() {
        this.format = CSVFormat.DEFAULT;
    }

    public void setDelimiter(char delimiter) {
        /* write */ this.format = this.format.withDelimiter(delimiter);
    }

    public void parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        for (CSVRecord rec : parser.getRecords()) {
            String name = rec.get(0); // assuming first column is name
            recordMap.put(name, rec);
        }
    }

    public CSVRecord getRecordByName(String name) {
        return recordMap.get(name);
    }
}
