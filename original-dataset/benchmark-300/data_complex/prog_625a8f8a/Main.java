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
        list3.add(100);
        list3.add(200);

        /* write */ list.add(1);

        // Iterating through list2 and adding elements to list
        for (Integer num : list2) {
            list.add(num);
        }

        // Getting the first element from list3
        int x = list3.get(0);
        System.out.println("First element from list3: " + x);

        /* read */ int value = list.get(0);
        System.out.println("Value read from list: " + value);

        // Adding more elements to list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Iterating through list and printing elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}