import java.util.HashMap;
import java.util.Map;

public class DataManager {
    private Map<String, Integer> dataMap = new HashMap<>();

    public void addData(String key, int value) {
        dataMap.put(key, value);
    }

    public int calculateSum() {
        int sum = 0;
        for (int value : dataMap.values()) {
            sum += value;
        }
        return sum;
    }

    public void printData() {
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
