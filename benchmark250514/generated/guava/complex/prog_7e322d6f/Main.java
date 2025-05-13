import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ImmutableMultimap.Builder<String, Integer> builder = ImmutableMultimap.builder();
        Map<String, String> simpleMap = new HashMap<>();
        ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();

        simpleMap.put("example", "test");
        setBuilder.add("element1").add("element2");

        /* write */ builder.put("key", 1);

        simpleMap.put("anotherExample", "test2");
        setBuilder.add("element3").add("element4");

        ImmutableMultimap<String, Integer> multimap = builder.build();
        ImmutableSet<String> immutableSet = setBuilder.build();

        if (simpleMap.containsKey("example")) {
            System.out.println("Simple map contains 'example': " + simpleMap.get("example"));
        }

        for (String element : immutableSet) {
            System.out.println("ImmutableSet Element: " + element);
        }

        /* read */ Integer value = multimap.get("key").iterator().next();

        System.out.println("Value from multimap: " + value);

        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        for (Integer number : multimap.values()) {
            System.out.println("Multimap Value: " + number);
        }
    }
}