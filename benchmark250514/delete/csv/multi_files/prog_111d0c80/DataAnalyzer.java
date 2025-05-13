import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAnalyzer {
    private Map<String, Integer> ageMap;

    public DataAnalyzer() {
        this.ageMap = new HashMap<>();
    }

    public void populateMap(List<CSVRecord> records) {
        for (CSVRecord record : records) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            ageMap.put(name, age);
        }
    }

    public int getAge(String name) {
        return ageMap.getOrDefault(name, -1);
    }

    public void printAges() {
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}
