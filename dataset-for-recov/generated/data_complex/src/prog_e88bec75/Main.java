import java.util.Hashtable;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();

        // Initialize the HashSet and ArrayList with some values
        for (int i = 0; i < 5; i++) {
            hashSet.add(i * 10);
            arrayList.add("Element " + i);
        }

        // Perform operations on the HashSet
        for (Integer num : hashSet) {
            System.out.println("HashSet value: " + num);
        }

        // Perform operations on the ArrayList
        for (String element : arrayList) {
            System.out.println("ArrayList element: " + element);
        }

        // Add a key-value pair to the Hashtable
        /* write */ hashtable.put("key", 42);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // More complex operations
        if (hashSet.contains(20)) {
            System.out.println("HashSet contains 20");
        } else {
            System.out.println("HashSet does not contain 20");
        }

        // Retrieve the value from the Hashtable
        /* read */ int value = hashtable.get("key");
        System.out.println("Retrieved value from Hashtable: " + value);

        // Continue with other operations
        arrayList.add("New Element");
        for (String element : arrayList) {
            System.out.println("Updated ArrayList element: " + element);
        }
    }
}