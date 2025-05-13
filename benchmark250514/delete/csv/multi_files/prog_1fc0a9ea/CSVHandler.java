import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.Iterator;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        // Initialize the CSVFormat object with ignoring empty lines
        /* write */ this.format = CSVFormat.DEFAULT.withIgnoreEmptyLines();
    }

    public Iterable<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData));
    }
}
