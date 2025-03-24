import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        /* write */ queue.put(new DelayedElement(1000)); // Delay of 1 second
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue: " + element);
    }
}

class DelayedElement implements Delayed {
    private long startTime;
    private long delay;

    public DelayedElement(long delay) {
        this.delay = delay;
        this.startTime = System.currentTimeMillis() + delay;
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
                ", delay=" + delay +
                '}';
    }
}