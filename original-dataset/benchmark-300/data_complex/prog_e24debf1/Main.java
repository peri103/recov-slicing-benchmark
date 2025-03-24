import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>(5);

        try {
            /* write */ queue.put(1);
            stringQueue.put("Hello");
            stringQueue.put("World");

            for (int i = 0; i < 5; i++) {
                queue.put(i * 10);
            }

            while (!stringQueue.isEmpty()) {
                System.out.println(stringQueue.take());
            }

            /* read */ int value = queue.take();
            System.out.println(value);

            for (int i = 0; i < queue.size(); i++) {
                System.out.println(queue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}