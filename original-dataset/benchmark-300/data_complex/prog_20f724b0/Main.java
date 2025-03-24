import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(long delay, String data) {
        this.startTime = System.currentTimeMillis() + delay;
        this.data = data;
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

    public String getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000, "Test Data");
        
        /* write */ queue.put(element);

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add("Item " + i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }

        for (String s : linkedList) {
            System.out.println("LinkedList value: " + s);
        }

        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println("Taken element data: " + takenElement.getData());

        list.add(100);
        linkedList.add("New Item");

        System.out.println("Updated List: " + list);
        System.out.println("Updated LinkedList: " + linkedList);
    }
}