import org.apache.commons.collections4.MultiValuedMap;

public class DataProcessor {
    private MultiValuedStore store = new MultiValuedStore();

    public void processData() {
        store.addValue("key", 42);
        store.addValue("anotherKey", 100);
        store.addValue("anotherKey", 200);
    }

    public Integer getValue(String key) {
        MultiValuedMap<String, Integer> map = store.getMap();
        return map.get(key).iterator().next();
    }

    public int getSumOfValues(String key) {
        MultiValuedMap<String, Integer> map = store.getMap();
        int sum = 0;
        for (Integer num : map.get(key)) {
            sum += num;
        }
        return sum;
    }
}
