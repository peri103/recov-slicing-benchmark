import com.google.common.collect.ImmutableBiMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        /* write */ builder.put("key1", 100);
        ImmutableBiMap<String, Integer> biMap = builder.build();
        ArrayList<String> stringList = new ArrayList<>();
        LinkedList<Integer> integerList = new LinkedList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the lists and map
        stringList.add("value1");
        stringList.add("value2");
        integerList.add(200);
        hashMap.put("key2", 300);

        // Processing the lists and map
        for (String str : stringList) {
            System.out.println("String List Element: " + str);
        }

        for (Integer num : integerList) {
            System.out.println("Integer List Element: " + num);
        }

        // Accessing the hashMap
        System.out.println("HashMap Value for key2: " + hashMap.get("key2"));

        // Additional processing
        for (int i = 0; i < 5; i++) {
            integerList.add(i * 10);
        }
        for (Integer num : integerList) {
            System.out.println("Processed Integer List Element: " + num);
        }

        /* read */ int value = biMap.get("key1");
        System.out.println("Value retrieved from ImmutableBiMap: " + value);
    }
}