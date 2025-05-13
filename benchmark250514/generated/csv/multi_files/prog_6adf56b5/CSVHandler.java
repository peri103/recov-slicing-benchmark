import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private List<CSVRecord> records = new ArrayList<>();
    private CSVFormat format;

    public CSVHandler(String csvData) throws IOException {
        /* write */ format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        for (CSVRecord record : parser) {
            records.add(record);
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }

    public CSVFormat getFormat() {
        return format;
    }
}
