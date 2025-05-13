import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class CSVUtils {
    private CSVFormat format;

    public CSVUtils() {
        // Initialize CSVFormat with header comments
        this.format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        Reader in = new StringReader(csvData);
        CSVParser parser = new CSVParser(in, format);
        return parser.getRecords();
    }
}
