import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class CSVDataHandler {
    private CSVFormat format;

    public CSVDataHandler() {
        // Initialize CSVFormat with a comment marker
        this.format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');
    }

    public CSVParser parseCSV(String csvData) throws IOException {
        return CSVParser.parse(new StringReader(csvData), format);
    }
}
