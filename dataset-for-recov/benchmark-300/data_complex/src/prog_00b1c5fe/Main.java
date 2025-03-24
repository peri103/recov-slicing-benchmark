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
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");

        // Writing to the HashSet
        /* write */ set.add("example");

        // Reading from the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the HashSet
        /* read */ boolean containsValue = set.contains("example");
        System.out.println("HashSet contains 'example': " + containsValue);

        // Adding more elements to the HashSet
        set.add("anotherExample");
        set.add("yetAnotherExample");

        // Printing all elements in the HashSet
        for (String str : set) {
            System.out.println("HashSet element: " + str);
        }
    }
}