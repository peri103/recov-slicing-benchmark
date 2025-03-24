import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(100);
        pq.offer(1);
        pq.offer(50);
        int variable = (int) (Math.random() * 100);
        if (variable < 50) {
            /* write */ pq.offer(-10);
        } else {
            pq.offer(25);
        }
        pq.offer(5);
        pq.offer(20);
        pq.offer(15);
        pq.poll(); 
        pq.poll();
        /* read */ int ret = pq.peek();
        System.out.println("Read value from PriorityQueue: " + ret);
    }
}