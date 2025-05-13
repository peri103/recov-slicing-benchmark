import com.google.common.collect.MinMaxPriorityQueue;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        PriorityQueue<Integer> anotherQueue = new PriorityQueue<>();
        Queue<Integer> simpleQueue = new PriorityQueue<>();

        /* write */ queue.offer(10);

        anotherQueue.offer(20);
        anotherQueue.offer(30);
        anotherQueue.offer(40);

        System.out.println("Iterating over anotherQueue:");
        for (Integer num : anotherQueue) {
            System.out.println(num);
        }

        simpleQueue.offer(50);
        simpleQueue.offer(60);

        System.out.println("Iterating over simpleQueue:");
        while (!simpleQueue.isEmpty()) {
            System.out.println(simpleQueue.poll());
        }

        int sum = 0;
        for (Integer num : anotherQueue) {
            sum += num;
        }
        System.out.println("Sum of anotherQueue: " + sum);

        /* read */ int value = queue.peek();
        System.out.println("Peeked value from queue: " + value);

        anotherQueue.offer(70);
        anotherQueue.offer(80);

        System.out.println("Iterating over anotherQueue after adding more elements:");
        for (Integer num : anotherQueue) {
            System.out.println(num);
        }
    }
}