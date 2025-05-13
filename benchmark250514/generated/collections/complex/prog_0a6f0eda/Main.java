import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a default expiration time of 1000 milliseconds
        PassiveExpiringMap<Integer, String> map = new PassiveExpiringMap<>(1000);

        // Initialize another PassiveExpiringMap for additional operations
        PassiveExpiringMap<Integer, String> additionalMap = new PassiveExpiringMap<>(2000);

        // Initialize a HashMap for unrelated operations
        HashMap<Integer, String> hashMap = new HashMap<>();

        /* write */ map.put(1, "Hello, World!");

        // Perform operations on the additional map
        additionalMap.put(2, "Another value");
        additionalMap.put(3, "Yet another value");

        // Perform operations on the HashMap
        hashMap.put(10, "Unrelated value");
        hashMap.put(20, "Another unrelated value");

        // Access values from the additional map
        String additionalValue1 = additionalMap.get(2);
        String additionalValue2 = additionalMap.get(3);
        System.out.println("Additional Map Value 1: " + additionalValue1);
        System.out.println("Additional Map Value 2: " + additionalValue2);

        // Access values from the HashMap
        String hashMapValue1 = hashMap.get(10);
        String hashMapValue2 = hashMap.get(20);
        System.out.println("HashMap Value 1: " + hashMapValue1);
        System.out.println("HashMap Value 2: " + hashMapValue2);

        // Perform unrelated computations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum of numbers: " + sum);

        // Access the original map value
        /* read */ String value = map.get(1);
        System.out.println(value);

        // Perform additional operations after the read
        for (int i = 0; i < 3; i++) {
            hashMap.put(i, "Value" + i);
        }
        System.out.println("Final HashMap: " + hashMap);
    }
}