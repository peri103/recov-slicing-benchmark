import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        /* write */ priorityQueue.offer(42);
        /* read */ Integer value = priorityQueue.peek();
        System.out.println(value);
    }
}