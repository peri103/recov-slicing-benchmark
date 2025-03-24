import java.util.ArrayDeque;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(10);
        deque.add(15);
        /* write */deque.add(20);
        Random random = new Random();
        int x = random.nextInt(100);
        if (x % 3 == 0) {
            deque.addFirst(25);
        } else if (x % 3 == 1) {
            deque.addFirst(30);
        }
        deque.add(100);
        x = random.nextInt(100);
        if (x % 5 == 0) {
            deque.pollLast();
        } else if (x % 5 == 1) {
            deque.pollFirst();
        }
        deque.add(50);
        deque.add(60);
        x = random.nextInt(100);
        if (x % 2 == 0) {
            int temp = deque.remove();
            deque.addLast(temp + x);
        }
        /* read */int ret = deque.toArray(new Integer[0])[4];
        System.out.println("Retrieved value: " + ret); 
    }
}