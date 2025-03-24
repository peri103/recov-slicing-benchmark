import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        /* write */ queue.put(new DelayedElement(1000)); // 1000 milliseconds delay
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue");
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long expireTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.expireTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = expireTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.expireTime, ((DelayedElement) o).expireTime);
    }
}