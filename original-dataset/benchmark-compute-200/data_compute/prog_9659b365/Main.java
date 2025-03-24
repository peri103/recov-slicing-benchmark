import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int a = 10, b = 20, c = 30;
        pq.add(5);
        pq.add(15);
        pq.add(25);
        int mysteryNumber = a * b + c;
        /* write */ if (mysteryNumber > 100) pq.add(1);
        pq.add(35);
        pq.poll(); 
        pq.add(10);
        if (pq.peek() > 10) pq.add(40);
        pq.poll();
        pq.add(0);
        pq.add(50);
        /* read */ Integer ret = pq.peek();
        System.out.println("Retrieved value: " + ret);
    }
}
