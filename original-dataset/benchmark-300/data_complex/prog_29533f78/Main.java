import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        // Adding elements to list2 and list3
        list2.add("World");
        list3.add(200);

        /* write */ list.add("Hello");

        // Reading from list3
        int x = list3.get(0);
        System.out.println("Value from LinkedList: " + x);

        // Adding elements from list2 to list
        for (String str : list2) {
            list.add(str);
        }

        /* read */ String value = list.get(0);
        System.out.println("Value from CopyOnWriteArrayList: " + value);

        // Creating and manipulating another ArrayList
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(i * 10);
        }

        // Adding elements from list4 to list
        for (int i = 0; i < list4.size(); i++) {
            list.add(String.valueOf(list4.get(i)));
        }

        // Printing elements from list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}