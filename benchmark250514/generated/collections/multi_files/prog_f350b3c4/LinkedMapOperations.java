import org.apache.commons.collections4.map.LinkedMap;

public class LinkedMapOperations {
    private LinkedMap<String, Integer> linkedMap = new LinkedMap<>();

    public void addEntry(String key, int value) {
        /* write */ linkedMap.put(key, value);
    }

    public Integer getEntry(String key) {
        return linkedMap.get(key);
    }

    public void removeEntry(String key) {
        linkedMap.remove(key);
    }

    public void printEntries() {
        for (String key : linkedMap.keySet()) {
            System.out.println("LinkedMap: " + key + " -> " + linkedMap.get(key));
        }
    }
}
