import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        // Initialize CSVFormat with header comments
        /* write */ this.format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
    }

    public CSVParser parseCSV(String csvData) throws IOException {
        return CSVParser.parse(new StringReader(csvData), format);
    }
}
