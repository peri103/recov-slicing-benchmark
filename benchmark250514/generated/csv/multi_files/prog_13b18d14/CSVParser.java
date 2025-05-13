import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class CSVParser {
    private CSVFormat format;

    public CSVParser() {
        /* write */ format = CSVFormat.DEFAULT.withIgnoreHeaderCase();
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new java.io.StringReader(csvData)).getRecords();
    }
}
