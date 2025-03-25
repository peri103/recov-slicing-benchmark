import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(42);
        deque.offer(25);
        deque.addLast(7);
        deque.offer(30);
        int mysteryNumber = 3;
        boolean flag = false;
        deque.poll();
        /* write */deque.offer(19);
        if (mysteryNumber * 2 == 6) {
            deque.poll();
            flag = true;
        }
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                deque.offer(10);
            } else {
                deque.poll();
            }
        }
        if (flag || mysteryNumber > 5) {
            deque.addLast(5);
        } else {
            deque.addLast(99);
        }
        deque.offerFirst(6);
        deque.addLast(11);
        deque.pollFirst();
        deque.offer(18);
        deque.addFirst(21); //predict
        deque.pollLast(); //predict
        if (deque.size() > 4) {
            deque.poll(); //predict
        }
        /* read */int ret = deque.peek();
        System.out.println("Retrieved value: " + ret);
    }
}
