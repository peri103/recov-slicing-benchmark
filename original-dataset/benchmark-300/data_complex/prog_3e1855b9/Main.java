import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
            ArrayList<Integer> list = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Adding elements to the ArrayList and LinkedList
            for (int i = 0; i < 5; i++) {
                list.add(i * 10);
                linkedList.add(i * 20);
            }

            /* write */ queue.put(1);

            // Processing the ArrayList and LinkedList
            for (Integer num : list) {
                System.out.println("ArrayList Element: " + num);
            }

            for (Integer num : linkedList) {
                System.out.println("LinkedList Element: " + num);
            }

            // Simulating some complex operations
            ArrayList<LinkedList<Integer>> complexList = new ArrayList<>();
            complexList.add(linkedList);

            for (LinkedList<Integer> ll : complexList) {
                for (Integer num : ll) {
                    System.out.println("Complex List Element: " + num);
                }
            }

            /* read */ int value = queue.take();
            System.out.println("Value from Queue: " + value);

            // Additional operations
            ArrayBlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(5);
            stringQueue.put("Hello");
            stringQueue.put("World");

            while (!stringQueue.isEmpty()) {
                System.out.println("String Queue Element: " + stringQueue.take());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}