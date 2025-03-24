import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
            ArrayList<Integer> list = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Adding elements to the ArrayList
            for (int i = 0; i < 5; i++) {
                list.add(i * 10);
            }

            // Adding elements to the LinkedList
            for (int i = 0; i < 5; i++) {
                linkedList.add(i * 20);
            }

            /* write */ queue.put(42);

            // Processing ArrayList elements
            for (Integer num : list) {
                System.out.println("ArrayList element: " + num);
            }

            // Processing LinkedList elements
            for (Integer num : linkedList) {
                System.out.println("LinkedList element: " + num);
            }

            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);

            // Adding more elements to the ArrayList
            for (int i = 5; i < 10; i++) {
                list.add(i * 10);
            }

            // Adding more elements to the LinkedList
            for (int i = 5; i < 10; i++) {
                linkedList.add(i * 20);
            }

            // Processing ArrayList elements again
            for (Integer num : list) {
                System.out.println("ArrayList element: " + num);
            }

            // Processing LinkedList elements again
            for (Integer num : linkedList) {
                System.out.println("LinkedList element: " + num);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}