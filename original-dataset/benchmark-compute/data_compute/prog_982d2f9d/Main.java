import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            deque.add(i);
        }
        int misleadingVar = 0;
        for (int i = 0; i < 5; i++) {
            misleadingVar += i;
        }
        if (misleadingVar > 10) {
            deque.addFirst(99);
        }
        int operation = (misleadingVar * 5) / 10;
        boolean flag = (operation % 2 == 0);
        if (flag) {
            deque.addLast(100);
        } else {
            deque.addFirst(101);
        }
         deque.add(42);
        for (int i = 0; i < 3; i++) {
            deque.poll();
            /* write */deque.offer(50 + i);
        }
        for (int num : deque) {
            System.out.println("Intermediate Value: " + num);
        }
        /* read */ int ret = deque.peek();
        System.out.println("Read Value: " + ret);
    }
}