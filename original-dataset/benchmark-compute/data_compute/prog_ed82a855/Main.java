import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            deque.addLast(i + 10);
        }
        deque.addFirst(100);
        deque.addLast(200);
        deque.offerFirst(300);
        deque.offerLast(400);
        int x = 5 * 42 / 3 + 19;
        if (x % 5 == 0) {
            deque.removeFirst();
            deque.addLast(500);
        } else {
            deque.pollFirst();
            deque.offerLast(600);
        }
        /* other operations */
        int y = x * 2 - 99;
        if (y % 2 == 0) {
            /* write */ deque.addFirst(1);
        } else {
            deque.addLast(700);
        }
        deque.removeLast();
        deque.addFirst(800);
        int z = y + x - 73;
        int indexOfInterest = 0;
        while (!deque.isEmpty() && indexOfInterest < 3) {
            Integer temp = deque.poll();
            if (temp == null || temp == 1) { 
                deque.addFirst(temp);
                break;
            }
            indexOfInterest++;
        }
        /* read */ int ret = deque.peekFirst();
        System.out.println("Retrieved value: " + ret);
    }
}
