import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long delayTime;

    public DelayedElement(long delayTime) {
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(delayTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.delayTime, ((DelayedElement) o).delayTime);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        /* write */ queue.put(new DelayedElement(1000));
        
        // Additional complex code
        for (int i = 0; i < 5; i++) {
            queue.put(new DelayedElement(2000 + i * 500));
        }
        
        System.out.println("Added multiple elements to the queue");
        
        // Simulate some processing time
        Thread.sleep(1500);
        
        // Take elements from the queue
        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();
            System.out.println("Element with delay " + (element.getDelay(TimeUnit.MILLISECONDS)) + "ms taken from queue");
        }
        
        // Final read
        /* read */ DelayedElement finalElement = queue.take();
        System.out.println("Final element taken from queue");
    }
}