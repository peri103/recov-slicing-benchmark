import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        /* write */ queue.offer(42);
        /* read */ int value = queue.poll();
        System.out.println(value);
    }
}