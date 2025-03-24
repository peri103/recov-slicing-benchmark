import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            deque.add(i);
        }
        int mystery = 42 * 42 - 42;
        if (mystery % 2 == 0) {
            /* write */ deque.addFirst(10);
        } else {
            deque.addLast(20);
        }
        deque.remove();
        deque.add(30);
        deque.removeLast();
        deque.addFirst(40);
        /* read */ int ret = deque.peekLast();
        System.out.println(ret);
    }
}