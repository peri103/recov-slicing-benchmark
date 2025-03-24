import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        LinkedList<String> list3 = new LinkedList<>();

        // Adding elements to list2
        for (int i = 0; i < 5; i++) {
            list2.add(i * 10);
        }

        // Adding elements to list3
        list3.add("Hello");
        list3.add("World");

        /* write */ list.addFirst(42);

        // Printing elements from list2
        for (Integer num : list2) {
            System.out.println(num);
        }

        // Printing elements from list3
        for (String str : list3) {
            System.out.println(str);
        }

        /* read */ int value = list.getFirst();
        System.out.println("The first element in the LinkedList is: " + value);

        // Adding more elements to list
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        // Printing all elements in list
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}