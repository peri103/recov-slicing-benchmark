import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, String> map = new TreeValuedHashMap<>();
        ArrayListValuedHashMap<Integer, String> arrayMap = new ArrayListValuedHashMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        /* write */ map.put("key1", "value1");
        
        arrayMap.put(1, "arrayValue1");
        arrayMap.put(2, "arrayValue2");
        hashMap.put("hashKey1", 100);
        hashMap.put("hashKey2", 200);
        
        // Perform operations on arrayMap
        for (int i = 1; i <= 2; i++) {
            Set<String> values = arrayMap.get(i);
            for (String value : values) {
                System.out.println("ArrayMap value for key " + i + ": " + value);
            }
        }
        
        // Perform operations on hashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Additional logic
        if (hashMap.containsKey("hashKey1")) {
            hashMap.put("hashKey1", hashMap.get("hashKey1") + 50);
        }
        
        System.out.println("Updated hashMap value for 'hashKey1': " + hashMap.get("hashKey1"));

        /* read */ String value = map.get("key1").first();
        System.out.println(value);
    }
}