import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        HashMap<String, String> stringMap = new HashMap<>();
        ArrayList<Integer> numberList = new ArrayList<>();

        stringMap.put("greeting", "Hello");
        stringMap.put("farewell", "Goodbye");

        for (int i = 0; i < 10; i++) {
            numberList.add(i * 2);
        }

        /* write */ map.put("key1", 42);

        // Perform operations on numberList
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform operations on stringMap
        StringBuilder sb = new StringBuilder();
        for (String key : stringMap.keySet()) {
            sb.append(stringMap.get(key)).append(" ");
        }
        System.out.println("Concatenated strings: " + sb.toString());

        // Retrieve value from map
        /* read */ Integer value = map.get("key1");
        System.out.println("Retrieved value: " + value);

        // Further operations on numberList
        for (int i = 0; i < numberList.size(); i++) {
            numberList.set(i, numberList.get(i) + 1);
        }

        // Print modified numberList
        System.out.println("Modified numbers:");
        for (Integer num : numberList) {
            System.out.print(num + " ");
        }
    }
}