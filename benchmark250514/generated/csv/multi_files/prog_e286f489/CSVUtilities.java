import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVUtilities(String csvData) {
        format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
