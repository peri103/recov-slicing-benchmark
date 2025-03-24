import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class Processor {
    private AtomicInteger counter = new AtomicInteger(0);
    private Random random = new Random();

    public void processQueue(ConcurrentLinkedQueue<Integer> queue) {
        for (int i = 0; i < 3; i++) {
            Integer element = queue.poll();
            if (element != null) {
                counter.addAndGet(element);
            }
        }
    }

    public int getCounterValue() {
        return counter.get();
    }
}
