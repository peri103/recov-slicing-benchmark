import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    private CSVFormat format;

    public CSVUtils() {
        /* write */ this.format = CSVFormat.DEFAULT.withTrailingDelimiter();
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        return new ArrayList<>(parser.getRecords());
    }
}