import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        /* write */pq.add(20);
        pq.add(30);
        int dummy = 0;
        for (int i = 0; i < 5; i++) {
            dummy += i * 2;
            pq.add(dummy);
        }
        boolean flag = dummy % 2 == 0;
        if (flag) {
            pq.offer(5);
        } else {
            pq.offer(15);
        }
        pq.add(40);
        pq.add(25);
        while (!pq.isEmpty() && pq.size() > 5) {
            pq.poll();
        }
        pq.add(35);
        pq.add(45);
        /* read */int ret = pq.peek();
    }
}
