import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
            ArrayList<Integer> list = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            /* write */ queue.put(42);

            for (int i = 0; i < 5; i++) {
                list.add(i * 10);
            }

            linkedList.addAll(list);

            for (int i = 0; i < linkedList.size(); i++) {
                System.out.println("LinkedList value: " + linkedList.get(i));
            }

            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);

            for (int i = 0; i < list.size(); i++) {
                System.out.println("ArrayList value: " + list.get(i));
            }

            ArrayBlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(5);
            stringQueue.put("Hello");
            stringQueue.put("World");

            System.out.println("String from stringQueue: " + stringQueue.take());
            System.out.println("String from stringQueue: " + stringQueue.take());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}