import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("World");
        linkedList.add("!");

        /* write */ set.add("Hello");

        // Iterating over the ArrayList and adding elements to the set
        for (Integer num : list) {
            set.add(num.toString());
        }

        // Iterating over the LinkedList and adding elements to the set
        for (String str : linkedList) {
            set.add(str);
        }

        // Performing some unrelated operations
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum);

        /* read */ boolean containsValue = set.contains("Hello");
        System.out.println("Set contains 'Hello': " + containsValue);

        // Printing all elements in the set
        System.out.println("Elements in the set:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}