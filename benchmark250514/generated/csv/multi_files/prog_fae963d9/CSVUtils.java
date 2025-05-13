import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    private CSVFormat format;

    public CSVUtils() {
        /* write */ format = CSVFormat.DEFAULT.withAllowMissingColumnNames();
    }

    public Iterable<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData));
    }

    public List<String> extractColumn(Iterable<CSVRecord> records, String columnName) {
        List<String> columnData = new ArrayList<>();
        for (CSVRecord record : records) {
            columnData.add(record.get(columnName));
        }
        return columnData;
    }
}
