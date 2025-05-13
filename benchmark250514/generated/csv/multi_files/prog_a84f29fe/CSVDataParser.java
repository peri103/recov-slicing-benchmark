import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class CSVDataParser {
    private List<CSVRecord> records;
    private Map<String, Integer> nameToAgeMap = new HashMap<>();

    public CSVDataParser(List<CSVRecord> records) {
        this.records = records;
        parseData();
    }

    private void parseData() {
        if (records != null) {
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameToAgeMap.put(name, age);
            }
        }
    }

    public void displayData() {
        for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }

    public boolean isNameSetForFirstRecord() {
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");
            return isSet;
        }
        return false;
    }

    public double calculateAverageAge() {
        int totalAge = 0;
        for (int age : nameToAgeMap.values()) {
            totalAge += age;
        }
        return totalAge / (double) nameToAgeMap.size();
    }
}
