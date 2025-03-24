import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(100);
        deque.addLast(200);
        int x = 42;
        if (x % 2 == 0) {
            x = x / 2;
        }
        deque.addFirst(x);
        deque.addFirst(300);
        int toggle = 1;
        int decisionPoint = x * toggle - 20;
        if (decisionPoint < 0) {
            deque.addLast(400);
        } else {
            deque.addFirst(500);
        }
        /* write */ if (decisionPoint > 0) {
            deque.add(0, 10); 
        } else {
            deque.addLast(50); 
        }
        deque.offerLast(600);
        deque.offer(700);
        /* read */ int ret = deque.getFirst();
        System.out.println("Retrieved value: " + ret);
    }
}
