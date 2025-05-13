import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.map.ListOrderedMap;

public class Main {
    public static void main(String[] args) {
        AbstractOrderedMapDecorator<String, Integer> map = new AbstractOrderedMapDecorator<>(new LinkedMap<>());
        AbstractOrderedMapDecorator<String, Integer> additionalMap = new AbstractOrderedMapDecorator<>(new ListOrderedMap<>());

        /* write */ map.put("key", 42);

        additionalMap.put("extraKey1", 100);
        additionalMap.put("extraKey2", 200);

        int extraValue1 = additionalMap.get("extraKey1");
        System.out.println("Extra Value 1: " + extraValue1);

        for (String key : additionalMap.keySet()) {
            int value = additionalMap.get(key);
            map.put(key, value * 2);
        }

        int extraValue2 = additionalMap.get("extraKey2");
        System.out.println("Extra Value 2: " + extraValue2);

        /* read */ int value = map.get("key");
        System.out.println("Original Value: " + value);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of all values in map: " + sum);
    }
}