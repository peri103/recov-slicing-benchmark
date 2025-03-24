import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        LinkedList<Double> list3 = new LinkedList<>();

        // Adding elements to list2 and list3
        list2.add(100);
        list3.add(200.5);

        /* write */ list.add("Hello, World!");

        // Performing some operations with list2 and list3
        int x = list2.get(0);
        double y = list3.get(0);
        System.out.println("Value from list2: " + x);
        System.out.println("Value from list3: " + y);

        // Adding elements from list2 and list3 to list
        list.add(String.valueOf(x));
        list.add(String.valueOf(y));

        /* read */ String value = list.get(0);
        System.out.println("Value from list: " + value);

        // Adding more elements to list
        for (int i = 1; i <= 5; i++) {
            list.add("Element " + i);
        }

        // Printing all elements in list
        for (String element : list) {
            System.out.println(element);
        }
    }
}