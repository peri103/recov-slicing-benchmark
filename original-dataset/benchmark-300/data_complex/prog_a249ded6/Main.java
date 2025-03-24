import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 2);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 3);
        }

        /* write */ list.addLast(42);

        // Processing the ArrayList
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum);

        // Processing the LinkedList
        for (Object obj : list) {
            System.out.println("LinkedList element: " + obj);
        }

        /* read */ int value = (Integer) list.getLast();
        System.out.println("Last element in LinkedList: " + value);

        // Additional complex operations
        LinkedList<LinkedList<Integer>> nestedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            LinkedList<Integer> innerList = new LinkedList<>();
            for (int j = 0; j < 3; j++) {
                innerList.add(i + j);
            }
            nestedList.add(innerList);
        }

        for (LinkedList<Integer> inner : nestedList) {
            for (int num : inner) {
                System.out.println("Nested LinkedList element: " + num);
            }
        }
    }
}