import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> baseMap = new HashMap<>();
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);
        
        /* write */ fixedSizeMap.put("key", 42);
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }
        
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("first", "Hello");
        anotherMap.put("second", "World");
        
        String greeting = anotherMap.get("first") + " " + anotherMap.get("second");
        System.out.println(greeting);
        
        /* read */ int value = fixedSizeMap.get("key");
        
        System.out.println("Sum of list values: " + sum);
        System.out.println("Value from FixedSizeMap: " + value);
        
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Programming");
        
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}