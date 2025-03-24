import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        ArrayList list = new ArrayList();
        LinkedList list2 = new LinkedList();

        // Adding elements to the list and list2
        list.add(10);
        list.add(20);
        list2.add(30);
        list2.add(40);

        /* write */ set.add(1);

        // Iterating over list and adding elements to set
        for (Object obj : list) {
            set.add(obj);
        }

        // Iterating over list2 and adding elements to set
        for (Object obj : list2) {
            set.add(obj);
        }

        // Printing elements from list and list2
        for (Object obj : list) {
            System.out.println(obj);
        }
        for (Object obj : list2) {
            System.out.println(obj);
        }

        /* read */ boolean value = set.contains(1);
        System.out.println(value);

        // Adding more elements to set
        set.add(50);
        set.add(60);

        // Printing all elements in set
        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}