import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        int dummy = 3737;
        for (int i = 0; i < 5; i++) {
            dummy *= i + 1;
        }
        boolean executeWrite = dummy % 2 != 0 && dummy % 5 == 0;
        if (executeWrite) {
            /* write */ queue.offer(15);
        }
        queue.add(25);
        queue.add(35);
        queue.poll(); 
        queue.offer(5);
        queue.poll(); 
        queue.offer(40);
        int randomCalc = 0;
        for (int i = 0; i < 10; i++) {
            randomCalc += i;
        }
        /* read */ int ret = queue.peek(); 
        System.out.println("Retrieved: " + ret);
    }
}
