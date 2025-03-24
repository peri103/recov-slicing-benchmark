import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        for (int num : numbers) {
            deque.addFirst(num);
        }
        /* write */ deque.addLast(42);
        int sum = 0;
        while (!deque.isEmpty()) {
            sum += deque.takeFirst();
        }
        /* read */ int value = deque.takeLast();
        System.out.println("Sum of deque elements: " + sum);
        System.out.println("Value read from deque: " + value);
    }
}