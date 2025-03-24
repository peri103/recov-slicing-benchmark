import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
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
