import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        // Adding elements to list2 and list3
        list2.add(10);
        list2.add(20);
        list3.add(30);
        list3.add(40);

        // Writing to the original list
        /* write */ list.add(42);

        // Performing some operations with list2 and list3
        for (Integer num : list2) {
            list.add(num);
        }

        for (Integer num : list3) {
            list.add(num);
        }

        // Reading from the original list
        /* read */ int value = list.get(0);
        System.out.println("Value read from the original list: " + value);

        // Printing all elements in the list
        System.out.println("All elements in the list:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // Additional operations with list2 and list3
        list2.add(50);
        list3.add(60);

        // Printing elements from list2 and list3
        System.out.println("Elements in list2:");
        for (Integer num : list2) {
            System.out.println(num);
        }

        System.out.println("Elements in list3:");
        for (Integer num : list3) {
            System.out.println(num);
        }
    }
}