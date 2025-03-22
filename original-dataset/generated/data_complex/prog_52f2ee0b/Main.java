import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the ArrayList
        arrayList.add("Hello");
        arrayList.add("World");

        // Add key-value pairs to the HashMap
        map.put("One", 1);
        map.put("Two", 2);

        // Iterate over the ArrayList and print elements
        for (String str : arrayList) {
            System.out.println(str);
        }

        // Iterate over the HashMap and print key-value pairs
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Use the write method to add an element to the vector
        /* write */ vector.addElement(42);

        // Some unrelated complex operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Use the read method to retrieve the element from the vector
        /* read */ int value = vector.elementAt(0);
        System.out.println("Retrieved from vector: " + value);

        // More complex operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}