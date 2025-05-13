import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataProcessor {
    private List<CSVRecord> records;
    
    public void parseData(CSVConfig config, String csvData) {
        try {
            records = config.getFormat().parse(new StringReader(csvData)).getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        for (CSVRecord record : records) {
            if (record.isSet("Name")) {
                names.add(record.get("Name"));
            }
        }
        return names;
    }

    public int getTotalAge() {
        int totalAge = 0;
        for (CSVRecord record : records) {
            if (record.isSet("Age")) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
        }
        return totalAge;
    }

    public CSVRecord getFirstRecord() {
        return records.get(0);
    }
}
