import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<String> stringList = new ArrayList<>();
        LinkedList<Double> doubleList = new LinkedList<>();

        // Adding elements to ArrayList
        for (int i = 0; i < 5; i++) {
            stringList.add("String " + i);
        }

        // Adding elements to LinkedList
        for (double i = 0.5; i < 5; i++) {
            doubleList.add(i);
        }

        // Perform operations on stringList
        for (String s : stringList) {
            System.out.println(s);
        }

        // Perform operations on doubleList
        for (Double d : doubleList) {
            System.out.println(d);
        }

        // Adding and manipulating elements in LinkedList
        /* write */ list.addFirst(42);
        list.addFirst(84);
        list.addLast(126);

        // Perform some calculations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of elements in list: " + sum);

        // More complex logic
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max value in list: " + max);

        // Ensure the original read method is far apart
        /* read */ int value = list.getFirst();
        System.out.println("First element in list: " + value);

        // Additional operations
        list.removeLast();
        System.out.println("List after removing last element: " + list);
    }
}