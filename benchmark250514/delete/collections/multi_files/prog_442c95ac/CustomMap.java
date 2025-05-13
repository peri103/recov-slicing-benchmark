import org.apache.commons.collections4.map.AbstractSortedMap;
import java.util.TreeMap;

public class CustomMap {
    private AbstractSortedMap<Integer, String> map = new TreeMap<>();

    public void addEntry(int key, String value) {
        /* write */ map.put(key, value);
    }

    public String getEntry(int key) {
        return map.get(key);
    }

    public void displayEntries() {
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
