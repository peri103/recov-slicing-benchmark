import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVProcessor {
    private CSVFormat format;

    public CSVProcessor() {
        this.format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
    }

    public List<CSVRecord> parseCSV(String csvData) throws Exception {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        return parser.getRecords();
    }

    public boolean checkColumnSet(CSVRecord record, String columnName) {
        /* read */ return record.isSet(columnName);
    }
}
