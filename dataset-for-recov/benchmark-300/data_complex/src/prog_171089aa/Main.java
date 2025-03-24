import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        LinkedBlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        List<Integer> numberList = new ArrayList<>();

        // Adding elements to the stringQueue
        stringQueue.offer("Hello");
        stringQueue.offer("World");

        // Adding elements to the numberList
        numberList.add(5);
        numberList.add(10);
        numberList.add(15);

        /* write */ queue.offer(10);

        // Processing elements in the stringQueue
        try {
            String firstElement = stringQueue.take();
            System.out.println("First element from stringQueue: " + firstElement);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Processing elements in the numberList
        for (Integer num : numberList) {
            System.out.println("Number from numberList: " + num);
        }

        /* read */ Integer value = queue.poll();
        System.out.println("Value from queue: " + value);

        // Adding more elements to the queue
        queue.offer(20);
        queue.offer(30);

        // Polling elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Polled from queue: " + queue.poll());
        }
    }
}