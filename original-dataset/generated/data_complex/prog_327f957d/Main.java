import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Original LinkedList usage
        LinkedList<Integer> list = new LinkedList<>();
        /* write */ list.add(42);

        // Additional code to increase complexity
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        for (String str : stringList) {
            System.out.println(str);
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Simulating some operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // More LinkedList operations
        list.add(84);
        list.add(126);

        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);

        // Reading the original written value
        /* read */ int value = list.get(0);
        System.out.println("First element in list: " + value);

        // Further operations on list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}