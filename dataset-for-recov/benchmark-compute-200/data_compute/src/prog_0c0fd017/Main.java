import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        if (Math.random() > 0.5) {
            deque.addFirst(5);
        } else {
            deque.addLast(15);
        }
        deque.removeFirst();
        /* write */if (deque.peekFirst() % 2 == 0) {
            deque.addLast(25);
        } else {
            deque.addLast(30);
        }
        int check = (int) (Math.random() * 100);
        deque.removeLast();
        /* read */int ret = deque.peekFirst();
        System.out.println("Retrieved value: " + ret);
    }
}
