import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int rand = 5678 * 1234 + 3456;

        priorityQueue.offer(42);

        if (rand % 2 == 1) {
             priorityQueue.offer(100);
        } else {
            priorityQueue.offer(200);
        }

        int sum = priorityQueue.stream().reduce(0, (a, b) -> a + b);
        /* write */priorityQueue.offer(sum % 44);

        /* read */ int ret = priorityQueue.peek();
        System.out.println("Retrieved value: " + ret);
    }
}
