import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Writing to the HashSet
        /* write */ set.add("Hello");

        // Performing some operations with the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the HashSet
        /* read */ boolean containsHello = set.contains("Hello");
        System.out.println("Does the HashSet contain 'Hello'? " + containsHello);

        // Adding more elements to the HashSet
        set.add("World");
        set.add("Java");

        // Checking if the HashSet contains "World"
        boolean containsWorld = set.contains("World");
        System.out.println("Does the HashSet contain 'World'? " + containsWorld);

        // Adding all elements from the ArrayList to the HashSet
        for (Integer num : list) {
            set.add(num.toString());
        }

        // Printing the final state of the HashSet
        System.out.println("Final HashSet: " + set);
    }
}