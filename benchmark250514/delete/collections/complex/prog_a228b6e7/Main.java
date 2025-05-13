import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        TransformedMap<String, String, String, String> transformedMap = TransformedMap.transformedMap(
                originalMap, 
                key -> key.toUpperCase(), 
                value -> value.toLowerCase()
        );

        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");

        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("One", 1);
        anotherMap.put("Two", 2);

        /* write */ transformedMap.put("key", "Value");

        int sum = 0;
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in anotherMap: " + sum);

        for (String item : list) {
            System.out.println("List item: " + item);
        }

        /* read */ String value = transformedMap.get("KEY");
        System.out.println("TransformedMap value: " + value);

        Map<String, String> yetAnotherMap = new HashMap<>();
        yetAnotherMap.put("Three", "3");
        yetAnotherMap.put("Four", "4");

        for (Map.Entry<String, String> entry : yetAnotherMap.entrySet()) {
            System.out.println("YetAnotherMap key-value: " + entry.getKey() + "-" + entry.getValue());
        }
    }
}