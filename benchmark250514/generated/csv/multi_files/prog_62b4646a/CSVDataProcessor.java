import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class CSVDataProcessor {
    private CSVConfiguration configuration;
    private List<CSVRecord> records;

    public CSVDataProcessor(CSVConfiguration configuration, String csvData) {
        this.configuration = configuration;
        parseCSVData(csvData);
    }

    private void parseCSVData(String csvData) {
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), configuration.getFormat());
            records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isLocationSetInFirstRecord() {
        CSVRecord record = records.get(0);
        /* read */ return record.isSet("Location");
    }

    public Map<String, Integer> countLocations() {
        Map<String, Integer> locationCount = new HashMap<>();
        for (CSVRecord record : records) {
            String location = record.get("Location");
            locationCount.put(location, locationCount.getOrDefault(location, 0) + 1);
        }
        return locationCount;
    }

    public boolean doAllRecordsHaveAge() {
        for (CSVRecord record : records) {
            if (!record.isSet("Age")) {
                return false;
            }
        }
        return true;
    }
}
