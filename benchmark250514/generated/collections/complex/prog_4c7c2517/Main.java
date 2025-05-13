import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(map, () -> 0);

        ArrayList<String> keysList = new ArrayList<>();
        keysList.add("key");
        keysList.add("key2");
        keysList.add("key3");

        /* write */ lazyMap.put("key", 42);

        for (String key : keysList) {
            if (!lazyMap.containsKey(key)) {
                lazyMap.put(key, key.length());
            }
        }

        int sum = 0;
        for (Map.Entry<String, Integer> entry : lazyMap.entrySet()) {
            sum += entry.getValue();
        }

        System.out.println("Sum of values: " + sum);

        /* read */ int value = lazyMap.get("key");

        System.out.println("Value for 'key': " + value);

        LazyMap<String, String> lazyStringMap = LazyMap.lazyMap(new HashMap<>(), () -> "default");
        lazyStringMap.put("name", "Alice");
        lazyStringMap.put("city", "Wonderland");

        String name = lazyStringMap.get("name");
        String city = lazyStringMap.get("city");
        String country = lazyStringMap.get("country");

        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}