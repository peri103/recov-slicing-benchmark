import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHelper {
    private CSVFormat format;

    public CSVHelper() {
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        // Write operation: configure the format to ignore header case
        /* write */ format = format.withIgnoreHeaderCase();
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        return parser.getRecords();
    }
}
