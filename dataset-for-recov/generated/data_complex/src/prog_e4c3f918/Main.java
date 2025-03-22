import java.util.Hashtable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        
        // Additional data structures
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Operations on ArrayList
        arrayList.add("Hello");
        arrayList.add("World");
        for (String str : arrayList) {
            System.out.println("ArrayList item: " + str);
        }

        // Operations on LinkedList
        linkedList.add(3.14);
        linkedList.add(2.71);
        for (Double num : linkedList) {
            System.out.println("LinkedList item: " + num);
        }

        // Operations on HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        for (Integer key : hashMap.keySet()) {
            System.out.println("HashMap key: " + key + ", value: " + hashMap.get(key));
        }

        // Write to Hashtable
        /* write */ hashtable.put("key", 42);

        // More operations
        arrayList.add("Java");
        linkedList.add(1.618);
        hashMap.put(3, "Three");

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 9: " + sum);

        // Read from Hashtable
        /* read */ Integer value = hashtable.get("key");
        System.out.println("Value from Hashtable: " + value);

        // Final operations
        for (String str : arrayList) {
            System.out.println("Final ArrayList item: " + str);
        }
        for (Double num : linkedList) {
            System.out.println("Final LinkedList item: " + num);
        }
        for (Integer key : hashMap.keySet()) {
            System.out.println("Final HashMap key: " + key + ", value: " + hashMap.get(key));
        }
    }
}