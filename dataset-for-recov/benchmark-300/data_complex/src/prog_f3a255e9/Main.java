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
        String data = "Hello, World!";
        /* write */ queue.put(new DelayedElement(1000, data));

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        for (String item : linkedList) {
            list.add(item.length());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List item " + i + ": " + list.get(i));
        }

        /* read */ DelayedElement element = queue.take();
        System.out.println("Delayed element data: " + element.getData());

        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Another");
        anotherList.add("List");
        anotherList.add("Items");

        for (String item : anotherList) {
            System.out.println("Another list item: " + item);
        }
    }
}