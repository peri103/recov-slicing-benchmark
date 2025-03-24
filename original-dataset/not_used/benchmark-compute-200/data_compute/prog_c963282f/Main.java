import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        if (Math.random() > 0.5) {
            pq.remove(50);  
        } else {
            pq.peek();  
        }
        int result = (int)(Math.pow(5, 3) + 42);
        result = result % 5;
        /* write */ pq.add(25);  
        pq.add(200); 
        pq.add(75); 
        pq.poll();  
        pq.peek();  
        /* read */ int ret = pq.peek();  
        System.out.println("The read value is: " + ret);
    }
}