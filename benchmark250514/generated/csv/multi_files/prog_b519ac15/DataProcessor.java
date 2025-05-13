import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessor {
    private List<CSVRecord> records;

    public DataProcessor(List<CSVRecord> records) {
        this.records = records;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> nameToAgeMap = new HashMap<>();
        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            nameToAgeMap.put(name, age);
        }
        return nameToAgeMap;
    }

    public double calculateAverageAge(Map<String, Integer> nameToAgeMap) {
        int totalAge = 0;
        for (int age : nameToAgeMap.values()) {
            totalAge += age;
        }
        return (double) totalAge / nameToAgeMap.size();
    }
}
