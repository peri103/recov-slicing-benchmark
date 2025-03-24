import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            SynchronousQueue<Integer> queue = new SynchronousQueue<>();
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

            // Processing ArrayList
            for (Integer num : list) {
                System.out.println("ArrayList value: " + num);
            }

            // Processing LinkedList
            for (Integer num : linkedList) {
                System.out.println("LinkedList value: " + num);
            }

            /* read */ int value = queue.take();
            System.out.println("Value from SynchronousQueue: " + value);

            // Additional unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}