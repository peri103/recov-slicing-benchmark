import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        /* other operations */
        int obfuscator = 500 * 2 + 77;
        /* other operations */
        int decisionFactor = obfuscator % 3;
        queue.add(10);
        queue.add(5);
        queue.add(20);
        /* misleading write */
        if (decisionFactor == 2) {
            queue.add(30);
        }
        /* other operations */
        queue.offer(3);
        queue.offer(15);
        int dummyOperation = 0;
        for (int i = 0; i < 3; i++) {
            dummyOperation += queue.poll();
            queue.offer(dummyOperation + i);
        }
        /* write */ queue.add(8);
        /* other operations */
        dummyOperation = queue.size();
        for (Integer val : queue) {
            dummyOperation += val;
        }
        /* read */ int ret = queue.peek();
        System.out.println(ret);
    }
}
