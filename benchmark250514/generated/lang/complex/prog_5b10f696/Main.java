import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        /* write */ stopWatch.start();
        
        // Simulate some processing time
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        
        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Another StopWatch instance for measuring different task
        StopWatch taskTimer = new StopWatch();
        taskTimer.start();
        
        // Simulate another task
        for (int i = 0; i < 500000; i++) {
            // Just a dummy operation
            sum -= i;
        }
        
        taskTimer.stop();
        long taskTimeElapsed = taskTimer.getTime();
        System.out.println("Task time elapsed: " + taskTimeElapsed + " milliseconds");
        
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Total time elapsed: " + timeElapsed + " milliseconds");
    }
}