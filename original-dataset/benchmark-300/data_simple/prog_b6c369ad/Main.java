import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000);
        
        /* write */ queue.put(element);
        
        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println("Element taken from queue: " + takenElement);
    }
}

class DelayedElement implements Delayed {
    private long startTime;
    
    public DelayedElement(long delayInMilliseconds) {
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
    }
    
    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime, ((DelayedElement) o).startTime);
    }
    
    @Override
    public String toString() {
        return "DelayedElement{" +
                "startTime=" + startTime +
                '}';
    }
}