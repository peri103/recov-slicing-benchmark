import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<Integer> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // Adding elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding strings to the string list
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        // Printing elements from the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        // Printing strings from the string list
        for (String str : stringList) {
            System.out.println("String list element: " + str);
        }

        /* write */ queue.put(new DelayedElement(1000)); // 1000 milliseconds delay

        // Simulating some other operations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Concatenating strings from the string list
        StringBuilder concatenatedString = new StringBuilder();
        for (String str : stringList) {
            concatenatedString.append(str).append(" ");
        }
        System.out.println("Concatenated string: " + concatenatedString.toString().trim());

        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken after delay: " + element);
    }
}

class DelayedElement implements Delayed {
    private long startTime;

    public DelayedElement(long delayInMilliseconds) {
        this.startTime = System.currentTimeMillis() + delayInMilliseconds;
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
                '}';
    }
}