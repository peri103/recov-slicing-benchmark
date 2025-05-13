import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class CSVDataHandler {
    private CSVFormat format;
    private List<CSVRecord> csvRecords = new ArrayList<>();

    public CSVDataHandler() {
        // Initialize CSVFormat with a comment marker
        format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');
    }

    public void parseCSV(String csvData) {
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            csvRecords.addAll(parser.getRecords());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getCSVRecords() {
        return csvRecords;
    }
}
