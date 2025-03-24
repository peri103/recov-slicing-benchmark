import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        LinkedList<String> list3 = new LinkedList<>();

        // Adding some elements to list2
        for (int i = 0; i < 5; i++) {
            list2.add(i * 10);
        }

        // Adding some elements to list3
        list3.add("Hello");
        list3.add("World");

        /* write */ list.addFirst(42);

        // Iterating through list2 and printing elements
        for (Integer num : list2) {
            System.out.println("List2 element: " + num);
        }

        // Iterating through list3 and printing elements
        for (String str : list3) {
            System.out.println("List3 element: " + str);
        }

        /* read */ int value = list.getFirst();
        System.out.println("Value from LinkedList: " + value);

        // Adding more elements to list
        for (int i = 1; i <= 5; i++) {
            list.add(i * 100);
        }

        // Printing all elements in list
        for (Integer num : list) {
            System.out.println("List element: " + num);
        }
    }
}