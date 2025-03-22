import java.util.HashMap;

public class DataManager {
    private HashMap<String, Integer> map = new HashMap<>();

    public void addEntry(String key, int value) {
        map.put(key, value);
    }

    public void displayMapContents() {
        System.out.println("Map Contents:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
