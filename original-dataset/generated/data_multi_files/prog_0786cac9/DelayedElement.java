import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
    private final String value;
    private final long startTime;

    public DelayedElement(String value, long delay) {
        this.value = value;
        this.startTime = System.currentTimeMillis() + delay;
    }

    public String getValue() {
        return value;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startTime - System.currentTimeMillis();
        return unit.convert(delay, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        if (this.startTime < ((DelayedElement) other).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedElement) other).startTime) {
            return 1;
        }
        return 0;
    }
}