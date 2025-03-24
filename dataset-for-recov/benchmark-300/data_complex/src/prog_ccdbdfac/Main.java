import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<Integer> list = new ArrayList<>();
        /* write */ queue.put(new DelayedElement(1000)); // 1 second delay
        
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }
        
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken after delay: " + element);
        
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        anotherQueue.put(new DelayedElement(2000)); // 2 seconds delay
        DelayedElement anotherElement = anotherQueue.take();
        System.out.println("Another element taken after delay: " + anotherElement);
    }
}

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long elapsedTime = System.currentTimeMillis() - startTime;
        return unit.convert(delayTime - elapsedTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}