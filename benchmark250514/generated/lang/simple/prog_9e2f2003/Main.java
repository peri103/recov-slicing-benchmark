import org.apache.commons.lang3.time.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(); // Start the stopwatch
        stopWatch.suspend(); // Suspend the stopwatch to simulate a pause

        /* write */ stopWatch.resume(); // Resume the stopwatch

        try {
            // Simulate some elapsed time
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /* read */ long elapsedTime = stopWatch.getTime(); // Get the elapsed time
        System.out.println("Elapsed Time: " + elapsedTime + " ms");
    }
}