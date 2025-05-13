import org.apache.commons.lang3.time.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(); // Start the stopwatch to enable resume
        stopWatch.suspend(); // Suspend the stopwatch so that it can be resumed
        /* write */ stopWatch.resume(); // Resume the stopwatch
        long elapsedTime = 0;
        try {
            Thread.sleep(1000); // Simulate some elapsed time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /* read */ elapsedTime = stopWatch.getTime(); // Get the elapsed time
        System.out.println("Elapsed time in milliseconds: " + elapsedTime);
    }
}