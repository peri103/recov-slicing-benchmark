import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        /* other operations */
        int rand = 5678 * 1234 + 3456;
        /* other operations */
        priorityQueue.offer(42);
        /* other operations */
        if (rand % 2 == 1) {
            /* write */ priorityQueue.offer(100);
        } else {
            priorityQueue.offer(200);
        }
        /* other operations */
        int sum = priorityQueue.stream().reduce(0, (a, b) -> a + b);
        priorityQueue.offer(sum % 44);
        /* other operations */
        /* read */ int ret = priorityQueue.peek();
        System.out.println("Retrieved value: " + ret);
    }
}
