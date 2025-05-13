import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVDataParser {
    private List<CSVRecord> records;

    public CSVDataParser(String csvData, CSVConfiguration config) {
        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), config.getFormat());
            records = parser.getRecords();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
