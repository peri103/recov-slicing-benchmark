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
        if (this.startTime < ((DelayedElement) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedElement) o).startTime) {
            return 1;
        }
        return 0;
    }

    public String getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000, "Delayed Data");
        
        /* write */ queue.put(element);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("First Element");
        list.add("Second Element");
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        
        for (String str : list) {
            System.out.println(str);
        }
        
        for (Integer num : linkedList) {
            System.out.println(num);
        }
        
        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println(takenElement.getData());
    }
}