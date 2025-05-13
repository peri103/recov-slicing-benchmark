import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessor {
    private Map<String, Integer> nameAgeMap = new HashMap<>();

    public void processRecords(List<CSVRecord> records) {
        // Populate the map with data from records
        for (CSVRecord record : records) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            nameAgeMap.put(name, age);
        }
    }

    public void printNameAgeMap() {
        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }

    public double calculateAverageAge() {
        int totalAge = 0;
        for (int age : nameAgeMap.values()) {
            totalAge += age;
        }
        return totalAge / (double) nameAgeMap.size();
    }
}
