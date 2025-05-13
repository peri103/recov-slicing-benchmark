import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class CSVProcessor {
    private CSVConfiguration csvConfig;
    private List<CSVRecord> records;

    public CSVProcessor(CSVConfiguration csvConfig) {
        this.csvConfig = csvConfig;
        this.records = new ArrayList<>();
    }

    public void parseData(String csvData) {
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), csvConfig.getFormat());
            this.records = parser.getRecords();
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
