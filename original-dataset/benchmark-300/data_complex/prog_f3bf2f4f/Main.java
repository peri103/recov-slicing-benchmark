import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

class DelayedElement implements Delayed {
    private long delayTime;
    private long startTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.startTime = System.currentTimeMillis() + delayTime;
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
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        List<Integer> numbers = new ArrayList<>();
        
        // Adding some unrelated code to make the program more complex
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        System.out.println("Numbers list before processing: " + numbers);
        
        /* write */ queue.put(new DelayedElement(1000)); // 1 second delay
        
        // More unrelated code
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        
        System.out.println("Even numbers from the list: " + evenNumbers);
        
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken from queue");
        
        // Final unrelated code
        int sum = 0;
        for (int num : evenNumbers) {
            sum += num;
        }
        
        System.out.println("Sum of even numbers: " + sum);
    }
}