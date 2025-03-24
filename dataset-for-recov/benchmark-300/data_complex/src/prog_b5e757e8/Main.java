import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        ArrayList list = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Adding elements to the LinkedList
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        /* write */ set.add(42);

        // Iterating through the ArrayList and adding elements to the HashSet
        for (Object obj : list) {
            set.add(obj);
        }

        // Iterating through the LinkedList and adding elements to the HashSet
        for (Object obj : linkedList) {
            set.add(obj);
        }

        // Printing elements from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Printing elements from the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Does the HashSet contain 42? " + containsValue);

        // Printing all elements in the HashSet
        for (Object obj : set) {
            System.out.println("HashSet element: " + obj);
        }
    }
}