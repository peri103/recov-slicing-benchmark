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
        list3.add(20);

        /* write */ list.add(1);

        // Processing elements from list3
        int x = list3.get(0);
        System.out.println("Value from LinkedList: " + x);

        // Adding elements from list2 to list
        for (Integer num : list2) {
            list.add(num);
        }

        /* read */ int value = list.get(0);
        System.out.println("Value from CopyOnWriteArrayList: " + value);

        // Creating and processing another ArrayList
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(i * 10);
        }

        // Adding elements from list4 to list
        for (int i = 0; i < list4.size(); i++) {
            list.add(list4.get(i));
        }

        // Printing elements from list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}