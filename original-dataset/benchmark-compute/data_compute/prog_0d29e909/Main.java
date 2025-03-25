import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int initVal = (int) Math.pow(3, 3);
        boolean halfDecision = (initVal % 3 == 0);
        if (halfDecision) {
            deque.addFirst(10);
        } else {
            deque.addLast(20);
        }
        /* write */deque.add(15);
        deque.add(25);
        deque.addLast(35);
        deque.removeFirst();
        deque.offer(40);
        if (deque.size() > 2) {
            deque.addFirst(5);
        }
        deque.add(50);
        deque.addLast(deque.removeLast());
        if (!deque.isEmpty()) {
            deque.remove();
        }
        /* read */int ret = deque.peekFirst();
        System.out.println(ret);
    }
}