import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> modifiableMap = new HashMap<>();
        UnmodifiableMap<String, Integer> map = UnmodifiableMap.unmodifiableMap(modifiableMap);

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 10);
        }

        /* write */ modifiableMap.put("key", 42);

        Collections.sort(numberList);
        System.out.println("Sorted List: " + numberList);

        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of List: " + sum);

        /* read */ int value = map.get("key");
        System.out.println(value);

        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("hello", "world");
        anotherMap.put("foo", "bar");

        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }
    }
}