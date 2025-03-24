import java.util.TreeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Adding some unrelated operations
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value" + i);
        }
        
        // Using the write method
        /* write */ map.put(1, "Hello");
        
        // More unrelated operations
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.get(i));
        }
        
        // Using the read method
        /* read */ String value = map.get(1);
        System.out.println(value);
        
        // Additional unrelated operations
        TreeMap<Integer, String> anotherMap = new TreeMap<>();
        anotherMap.put(10, "World");
        System.out.println(anotherMap.get(10));
    }
}