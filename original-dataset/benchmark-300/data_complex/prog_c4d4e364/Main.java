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
        /* write */ set.add(100);

        // Performing operations on the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Reading from the CopyOnWriteArraySet
        /* read */ boolean containsValue = set.contains(100);
        System.out.println("Contains value 100: " + containsValue);

        // Printing elements from the LinkedList
        for (Integer value : linkedList) {
            System.out.println("LinkedList value: " + value);
        }

        // Additional operations to make the program more complex
        CopyOnWriteArraySet<String> stringSet = new CopyOnWriteArraySet<>();
        stringSet.add("Hello");
        stringSet.add("World");

        for (String str : stringSet) {
            System.out.println("StringSet value: " + str);
        }
    }
}