import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new TransformedMultiValuedMap<>(new HashedMap<>());
        
        // Additional complex operations
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("simpleKey", 100);
        int simpleValue = simpleMap.get("simpleKey");
        System.out.println("Simple Map Value: " + simpleValue);
        
        MultiValuedMap<String, String> stringMap = new TransformedMultiValuedMap<>(new HashedMap<>());
        stringMap.put("fruit", "apple");
        stringMap.put("fruit", "banana");
        
        Collection<String> fruits = stringMap.get("fruit");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        /* write */ map.put("key", 42);
        
        // Additional operations before reading the original map
        MultiValuedMap<String, Double> multiValuedDoubleMap = new TransformedMultiValuedMap<>(new HashedMap<>());
        multiValuedDoubleMap.put("number", 3.14);
        multiValuedDoubleMap.put("number", 2.71);
        
        Collection<Double> numbers = multiValuedDoubleMap.get("number");
        System.out.println("Numbers:");
        for (Double num : numbers) {
            System.out.println(num);
        }

        /* read */ Collection<Integer> values = map.get("key");
        System.out.println("Values from original map:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}