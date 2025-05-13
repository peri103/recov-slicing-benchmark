import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CSVHandler {
    private CSVFormat csvFormat;
    private String csvData;

    public CSVHandler(String csvData) {
        this.csvData = csvData;
        this.csvFormat = CSVFormat.DEFAULT;
    }

    public void initializeFormat() {
        /* write */ this.csvFormat = this.csvFormat.withFirstRecordAsHeader();
    }

    public Map<String, Integer> parseCSV() throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
        Map<String, Integer> ageMap = new HashMap<>();
        for (CSVRecord record : parser) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            ageMap.put(name, age);
        }
        parser.close();
        return ageMap;
    }

    public CSVRecord getFirstRecord() throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
        CSVRecord record = parser.getRecords().get(0);
        parser.close();
        return record;
    }
}
