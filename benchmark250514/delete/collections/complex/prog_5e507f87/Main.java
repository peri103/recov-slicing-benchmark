import org.apache.commons.collections4.multimap.LinkedHashValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashValuedHashMap<String, Integer> map = new LinkedHashValuedHashMap<>();
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Alpha");
        stringMap.put("B", "Beta");
        stringMap.put("C", "Gamma");

        Set<Map.Entry<String, String>> entrySet = stringMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /* write */ map.put("key", 42);

        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i * 10);
        }

        System.out.println("Intermediate processing...");

        for (int i = 0; i < 5; i++) {
            System.out.println("Value for key" + i + ": " + map.get("key" + i));
        }

        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println("Read value: " + value);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += map.get("key" + i).iterator().next();
        }
        System.out.println("Sum of values: " + sum);

        System.out.println("Final processing complete.");
    }
}