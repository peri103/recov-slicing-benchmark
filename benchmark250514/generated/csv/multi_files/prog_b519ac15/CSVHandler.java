import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records = new ArrayList<>();

    public CSVHandler() {
        this.format = CSVFormat.DEFAULT;
        /* write */ this.format = this.format.withIgnoreEmptyLines(true);
    }

    public void parseCSV(String csvData) throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        for (CSVRecord record : parser) {
            records.add(record);
        }
        parser.close();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
