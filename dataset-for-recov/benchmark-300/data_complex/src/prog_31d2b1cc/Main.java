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

        /* write */ set.add("example");

        // Processing the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Processing the LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        /* read */ boolean containsExample = set.contains("example");
        System.out.println("Does the set contain 'example'? " + containsExample);

        // Additional unrelated operations
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numberSet.add(i);
        }

        System.out.println("Number set size: " + numberSet.size());
    }
}