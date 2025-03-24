import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        // Writing to the CopyOnWriteArraySet
        /* write */ set.add(1);

        // Adding elements from ArrayList to the CopyOnWriteArraySet
        for (Integer num : list) {
            set.add(num);
        }

        // Adding elements from LinkedList to the CopyOnWriteArraySet
        for (Integer num : linkedList) {
            set.add(num);
        }

        // Reading from the CopyOnWriteArraySet
        /* read */ boolean contains = set.contains(1);

        // Printing the result
        System.out.println("Contains 1: " + contains);

        // Printing all elements in the CopyOnWriteArraySet
        System.out.println("Elements in the set:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // Additional unrelated code
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println(str);
        }
    }
}