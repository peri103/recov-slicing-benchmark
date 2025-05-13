import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        HashSetValuedHashMap<String, Integer> secondaryMap = new HashSetValuedHashMap<>();
        HashSet<Integer> valueSet = new HashSet<>();

        /* write */ map.put("key", 42);
        
        for (int i = 0; i < 5; i++) {
            secondaryMap.put("secondaryKey", i * 10);
        }
        
        secondaryMap.put("secondaryKey", 50);

        for (Integer val : secondaryMap.get("secondaryKey")) {
            valueSet.add(val);
        }

        for (Integer val : valueSet) {
            System.out.println("Secondary Value: " + val);
        }

        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println("Original Value: " + value);

        HashSetValuedHashMap<String, String> stringMap = new HashSetValuedHashMap<>();
        stringMap.put("stringKey", "Hello");
        stringMap.put("stringKey", "World");

        for (String str : stringMap.get("stringKey")) {
            System.out.println("String Value: " + str);
        }
    }
}