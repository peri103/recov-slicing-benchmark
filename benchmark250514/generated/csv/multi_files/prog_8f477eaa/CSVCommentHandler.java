import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVCommentHandler {
    private CSVFormat format;

    public CSVCommentHandler() {
        /* write */ this.format = CSVFormat.DEFAULT.withCommentMarker('#');
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        return parser.getRecords();
    }
}
