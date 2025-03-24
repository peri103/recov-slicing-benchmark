import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
    private final long delayTime;
    private final long expireTime;
    private final String message;

    public DelayedElement(long delayTime, String message) {
        this.delayTime = delayTime;
        this.expireTime = System.currentTimeMillis() + delayTime;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(expireTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.expireTime, ((DelayedElement) o).expireTime);
    }
}
