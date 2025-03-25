import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(11);
        boolean flag = Math.random() > 0.5;
        /* other operations */
        queue.poll(); 
        /* other operations */
        /* write */ queue.offer(2);
        if (flag) {
            queue.offer(4); 
        }
        queue.poll(); 
        /* other operations */
        queue.offer(6); 
        queue.add(8); 
        queue.remove(11); 
        /* read */ int ret = queue.peek();
        System.out.println("Retrieved value: " + ret);
    }
}
