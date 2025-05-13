import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;

public class CSVDataProcessor {
    private CSVConfig csvConfig;
    private List<CSVRecord> records;

    public CSVDataProcessor(CSVConfig csvConfig, String csvData) throws Exception {
        this.csvConfig = csvConfig;
        CSVParser parser = new CSVParser(new StringReader(csvData), csvConfig.getFormat());
        records = parser.getRecords();
        parser.close();
    }

    public HashMap<String, Integer> processRecords() {
        HashMap<String, Integer> ageMap = new HashMap<>();
        for (CSVRecord rec : records) {
            ageMap.put(rec.get("Name"), Integer.parseInt(rec.get("Age")));
        }
        return ageMap;
    }

    public CSVRecord getFirstRecord() {
        return records.get(0);
    }
}
