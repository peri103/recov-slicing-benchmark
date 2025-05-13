import java.util.HashMap;
import java.util.Map;

public class DataProcessor {
    private Map<String, Integer> dataMap = new HashMap<>();

    public DataProcessor() {
        dataMap.put("file1", 100);
        dataMap.put("file2", 200);
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer value : dataMap.values()) {
            sum += value;
        }
        return sum;
    }

    public void updateValues(int increment) {
        for (String key : dataMap.keySet()) {
            dataMap.put(key, dataMap.get(key) + increment);
        }
    }

    public void printData() {
        for (Map.Entry<String, Integer> mapEntry : dataMap.entrySet()) {
            System.out.println("Updated: " + mapEntry.getKey() + " with value: " + mapEntry.getValue());
        }
    }
}
