import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Original DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        DelayedElement element = new DelayedElement("Hello, World!", 5000); // 5 seconds delay
        /* write */ queue.put(element);

        // Additional code to increase complexity
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 2);
            linkedList.add("String " + i);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList element: " + arrayList.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Simulate some delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More complex operations
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum);

        StringBuilder concatenatedStrings = new StringBuilder();
        for (String str : linkedList) {
            concatenatedStrings.append(str).append(" ");
        }
        System.out.println("Concatenated LinkedList strings: " + concatenatedStrings.toString());

        // Reading from the DelayQueue
        try {
            /* read */ DelayedElement retrievedElement = queue.take();
            System.out.println(retrievedElement.getData());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DelayedElement implements Delayed {
    private final String data;
    private final long startTime;

    public DelayedElement(String data, long delay) {
        this.data = data;
        this.startTime = System.currentTimeMillis() + delay;
    }

    public String getData() {
        return data;
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
}