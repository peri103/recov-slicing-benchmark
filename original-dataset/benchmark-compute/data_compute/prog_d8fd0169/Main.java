import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            deque.add(i + 10);
        }
        int x = (int)Math.pow(2, 3);
        int y = (x * 3 + 15) % 4;
        /* misleading operation */
        if (y == 1) {
            deque.addLast(100);
        } else {
            deque.removeFirst(); 
        }
        /* write */ deque.addFirst(20); 
        if (x > 5) {
            deque.add(30);
        } else {
            deque.add(40);
        }
        deque.addLast(60);
        /* misleading operation */
        deque.pollFirst();
        /* read */ int ret = deque.getFirst();
        System.out.println("Retrieved: " + ret);
    }
}