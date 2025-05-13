import java.util.ArrayList;
import java.util.HashMap;

public class DataProcessor {
    private ArrayList<Integer> numbers;
    private HashMap<String, Integer> map;

    public DataProcessor() {
        numbers = new ArrayList<>();
        map = new HashMap<>();
        initializeData();
    }

    private void initializeData() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int getMapValue(String key) {
        return map.get(key);
    }

    public void updateNumbers(int increment) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + increment);
        }
    }

    public int calculateUpdatedSum() {
        int updatedSum = 0;
        for (Integer num : numbers) {
            updatedSum += num;
        }
        return updatedSum;
    }
}
