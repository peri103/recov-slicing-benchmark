import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        list.add(10);
        list.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Writing to the CopyOnWriteArraySet
        /* write */ set.add(1);

        // Adding elements from list and linkedList to the set
        set.addAll(list);
        set.addAll(linkedList);

        // Performing some operations on the list and linkedList
        list.remove(0);
        linkedList.removeFirst();

        // Reading from the CopyOnWriteArraySet
        /* read */ boolean containsValue = set.contains(1);

        // Printing the results
        System.out.println("Contains value 1: " + containsValue);
        System.out.println("Set contents: " + set);
        System.out.println("List contents: " + list);
        System.out.println("LinkedList contents: " + linkedList);

        // Additional complex operations
        for (int i = 0; i < 5; i++) {
            set.add(i * 100);
        }

        for (Integer num : set) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }

        System.out.println("Updated List contents: " + list);
    }
}