import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class CSVUtils {
    private CSVFormat format;

    public CSVUtils() {
        this.format = CSVFormat.DEFAULT;
    }

    public void setRecordSeparator(String separator) {
        /* write */ format = format.withRecordSeparator(separator);
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData)).getRecords();
    }
}