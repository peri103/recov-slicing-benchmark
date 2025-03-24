import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        /* write */ 
        boolean condition = (100 - 50) > 49;
        if (condition) {
            queue.add(15);
        } else {
            queue.add(25);
        }
        queue.remove(30);
        queue.offer(40);
        int dummy = (int) Math.pow(2, 3);
        queue.offer(dummy);
        queue.poll();
        queue.add(5);
        condition = false;
        if (condition) {
            queue.add(50);
        }
        /* read */ 
        int ret = queue.peek(); 
        System.out.println("Retrieved: " + ret);
    }
}
