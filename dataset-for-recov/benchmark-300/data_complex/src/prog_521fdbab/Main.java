import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime + delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime + this.delayTime, ((DelayedElement) o).startTime + ((DelayedElement) o).delayTime);
    }

    @Override
    public String toString() {
        return "DelayedElement{" +
                "delayTime=" + delayTime +
                ", startTime=" + startTime +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();

        /* write */ queue.put(element);

        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement((i + 1) * 1000);
            list.add(newElement);
            linkedList.add(newElement);
        }

        for (DelayedElement e : list) {
            queue.put(e);
        }

        for (DelayedElement e : linkedList) {
            queue.put(e);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println(takenElement);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element " + i + ": " + list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element " + i + ": " + linkedList.get(i));
        }
    }
}