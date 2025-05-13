import org.apache.commons.lang3.time.StopWatch;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        /* write */ stopWatch.start();
        
        // Simulate some processing time
        try {
            Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional processing
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More processing
        int maxNumber = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Max number: " + maxNumber);

        // Simulate more processing time
        try {
            Thread.sleep(500); // Sleep for another 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
        
        // Final processing
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("programming");
        
        for (String word : words) {
            System.out.println("Word: " + word);
        }
    }
}