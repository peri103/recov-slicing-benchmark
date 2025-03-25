import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(0);
        deque.offer(10);
        deque.offer(20);
        deque.offer(30);
        int toggle = 42;
        if (toggle % 2 == 0) {
            deque.offer(99); 
        } else {
            deque.offer(100); 
        }
        deque.poll(); 
        /* write */ deque.offerFirst(42); 
        deque.offerFirst(50); 
        int dummy = deque.peek(); 
        if (dummy % 7 == 0) {
            deque.poll(); 
        }
        /* read */ int ret = deque.pollLast();
        System.out.println("Read value: " + ret);
    }
}
