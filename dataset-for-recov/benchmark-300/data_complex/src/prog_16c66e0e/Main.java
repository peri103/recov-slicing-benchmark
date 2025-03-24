import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        /* write */ queue.put(element);

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        System.out.println("Processing ArrayList:");
        for (Integer num : list) {
            System.out.println(num);
        }

        System.out.println("Processing LinkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken: " + takenElement.getDelay(TimeUnit.MILLISECONDS) + " ms");

        ArrayList<DelayedElement> delayedList = new ArrayList<>();
        delayedList.add(new DelayedElement(2000));
        delayedList.add(new DelayedElement(3000));

        System.out.println("Processing DelayedElement List:");
        for (DelayedElement delayed : delayedList) {
            System.out.println("Delay: " + delayed.getDelay(TimeUnit.MILLISECONDS) + " ms");
        }
    }

    static class DelayedElement implements Delayed {
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
    }
}