import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(long delay, String data) {
        this.startTime = System.currentTimeMillis() + delay;
        this.data = data;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayedElement) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedElement) o).startTime) {
            return 1;
        }
        return 0;
    }

    public String getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<String> log = new ArrayList<>();
        log.add("Program started");
        
        /* write */ queue.put(new DelayedElement(1000, "Hello, World!"));
        
        log.add("Element added to the queue");
        
        for (int i = 0; i < 5; i++) {
            log.add("Processing step " + i);
            Thread.sleep(200);
        }
        
        /* read */ DelayedElement element = queue.take();
        log.add("Element taken from the queue: " + element.getData());
        
        for (String entry : log) {
            System.out.println(entry);
        }
    }
}