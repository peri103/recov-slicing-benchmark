import org.apache.commons.collections4.map.StaticBucketMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StaticBucketMap<String, Integer> map = new StaticBucketMap<>();
        HashMap<String, String> stringMap = new HashMap<>();
        HashMap<Integer, Double> numberMap = new HashMap<>();

        stringMap.put("greeting", "Hello, World!");
        numberMap.put(1, 3.14);
        numberMap.put(2, 2.71);

        /* write */ map.put("key", 42);

        for (int i = 0; i < 5; i++) {
            stringMap.put("key" + i, "value" + i);
        }

        for (String key : stringMap.keySet()) {
            System.out.println("String Map: " + key + " -> " + stringMap.get(key));
        }

        for (Integer key : numberMap.keySet()) {
            System.out.println("Number Map: " + key + " -> " + numberMap.get(key));
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ Integer value = map.get("key");
        System.out.println("Read from StaticBucketMap: " + value);

        double average = sum / 10.0;
        System.out.println("Average: " + average);

        for (int i = 0; i < 5; i++) {
            numberMap.put(i, average * i);
        }

        for (Integer key : numberMap.keySet()) {
            System.out.println("Updated Number Map: " + key + " -> " + numberMap.get(key));
        }
    }
}