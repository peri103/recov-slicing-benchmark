import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        // Some unrelated operations with stringList
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println("StringList contains: " + str);
        }

        // Adding elements to doubleList
        for (double i = 0.5; i <= 2.5; i += 0.5) {
            doubleList.add(i);
        }
        System.out.println("DoubleList size: " + doubleList.size());

        // Adding elements to list
        list.add(10);
        list.add(20);
        /* write */ list.addLast(42);
        list.add(30);

        // Performing some operations on the list
        if (!list.isEmpty()) {
            int firstElement = list.getFirst();
            System.out.println("First element in list: " + firstElement);
        }

        // Unrelated loop operation
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Reading the last element
        /* read */ int value = list.getLast();
        System.out.println("Last element in list: " + value);

        // More operations on doubleList
        for (Double d : doubleList) {
            System.out.println("DoubleList element: " + d);
        }

        // Final summary of all elements in list
        System.out.println("All elements in list:");
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}