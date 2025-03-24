import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
    private final long expiryTime;

    public DelayedElement(long delayInMillis) {
        this.expiryTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = expiryTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long diff = this.expiryTime - ((DelayedElement) o).expiryTime;
        return Long.compare(diff, 0);
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "expiryTime=" + expiryTime +
                '}';
    }
}
