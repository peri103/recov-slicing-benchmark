import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.reflect.TypeToken;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        String valueToWrite = "Hello, World!";
        /* write */ map.putInstance(String.class, valueToWrite);

        // Additional complex code
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        int sum = 0;
        for (Integer num : arrayList) {
            sum += num;
        }

        System.out.println("Sum of ArrayList: " + sum);

        // More operations
        int hashSum = hashMap.get("One") + hashMap.get("Two") + hashMap.get("Three");
        System.out.println("Sum of HashMap values: " + hashSum);

        // Operations with the map
        Integer intValue = 42;
        map.putInstance(Integer.class, intValue);

        Double doubleValue = 3.14;
        map.putInstance(Double.class, doubleValue);

        Integer retrievedIntValue = map.getInstance(Integer.class);
        Double retrievedDoubleValue = map.getInstance(Double.class);

        System.out.println("Retrieved Integer: " + retrievedIntValue);
        System.out.println("Retrieved Double: " + retrievedDoubleValue);

        // Continue with unrelated operations
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        for (Integer num : arrayList) {
            System.out.println("ArrayList item: " + num);
        }

        // Finally read the original value
        /* read */ String valueRead = map.getInstance(String.class);
        System.out.println(valueRead);
    }
}