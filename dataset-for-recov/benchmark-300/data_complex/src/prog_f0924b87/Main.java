import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        ArrayList list = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // Adding elements to the ArrayList and LinkedList
        list.add("item1");
        list.add("item2");
        linkedList.add("linkedItem1");
        linkedList.add("linkedItem2");

        /* write */ set.add("example");

        // Adding elements from ArrayList and LinkedList to the HashSet
        for (Object item : list) {
            set.add(item);
        }
        for (Object item : linkedList) {
            set.add(item);
        }

        // Performing some operations with the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList item: " + list.get(i));
        }
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList item: " + linkedList.get(i));
        }

        /* read */ boolean contains = set.contains("example");
        System.out.println("Contains 'example': " + contains);

        // Adding more elements to the HashSet
        set.add("additionalItem1");
        set.add("additionalItem2");

        // Checking if the HashSet contains the additional items
        System.out.println("Contains 'additionalItem1': " + set.contains("additionalItem1"));
        System.out.println("Contains 'additionalItem2': " + set.contains("additionalItem2"));
    }
}