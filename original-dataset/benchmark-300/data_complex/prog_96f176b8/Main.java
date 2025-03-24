import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 5);
        }

        /* write */ queue.put(42);

        // Processing the ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList value: " + num);
        }

        // Processing the LinkedList
        for (Integer num : linkedList) {
            System.out.println("LinkedList value: " + num);
        }

        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);

        // Adding more elements to the ArrayList
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Adding more elements to the LinkedList
        for (int i = 5; i < 10; i++) {
            linkedList.add(i * 5);
        }

        // Processing the updated ArrayList
        for (Integer num : list) {
            System.out.println("Updated ArrayList value: " + num);
        }

        // Processing the updated LinkedList
        for (Integer num : linkedList) {
            System.out.println("Updated LinkedList value: " + num);
        }
    }
}