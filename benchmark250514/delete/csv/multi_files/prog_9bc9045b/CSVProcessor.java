import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {
    private CSVFormat format;

    public CSVProcessor() {
        format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');
    }

    public List<String> parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<String> recordStrings = new ArrayList<>();
        for (CSVRecord record : parser) {
            recordStrings.add(record.toString());
        }
        return recordStrings;
    }

    public CSVRecord getFirstRecord(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        return parser.getRecords().get(0);
    }
}
