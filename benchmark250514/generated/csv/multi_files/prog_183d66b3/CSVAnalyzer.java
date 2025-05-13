import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVAnalyzer {
    private List<CSVRecord> records;
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<String, Integer> ageMap = new HashMap<>();

    public CSVAnalyzer(List<CSVRecord> records) {
        this.records = records;
        analyzeRecords();
    }

    private void analyzeRecords() {
        for (CSVRecord rec : records) {
            if (rec.isSet("Name")) {
                names.add(rec.get("Name"));
            }
            if (rec.isSet("Age")) {
                ageMap.put(rec.get("Name"), Integer.parseInt(rec.get("Age")));
            }
        }
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public HashMap<String, Integer> getAgeMap() {
        return ageMap;
    }

    public boolean isNameSetInFirstRecord() {
        CSVRecord record = records.get(0);
        /* read */ return record.isSet("Name");
    }
}
