import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

class DelayedElement implements Delayed {
    private long startTime;
    private String data;

    public DelayedElement(long delayInMillis, String data) {
        this.startTime = System.currentTimeMillis() + delayInMillis;
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
        
        ArrayList<String> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        list.add("First Element");
        linkedList.add(100);
        
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 10);
        }
        
        for (String item : list) {
            System.out.println(item);
        }
        
        for (Integer value : linkedList) {
            System.out.println(value);
        }
        
        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println(takenElement.getData());
    }
}