import java.util.HashMap;
import java.util.Map;

public class Course {
    private String name;
    private RangeMapWrapper rangeMapWrapper = new RangeMapWrapper();
    private Map<Integer, String> hashMap = new HashMap<>();

    public Course(String name) {
        this.name = name;
    }

    public void addRange(Range<Integer> range, String value) {
        rangeMapWrapper.addRange(range, value);
    }

    public String getRangeValue(int key) {
        return rangeMapWrapper.getValue(key);
    }

    public void addHashMapEntry(int key, String value) {
        hashMap.put(key, value);
    }

    public String getHashMapValue(int key) {
        return hashMap.get(key);
    }
}
