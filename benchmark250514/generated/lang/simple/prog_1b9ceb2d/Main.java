import org.apache.commons.lang3.time.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(); // Start the stopwatch initially
        stopWatch.suspend(); // Suspend it to simulate some pause
        /* write */ stopWatch.resume(); // Resume the stopwatch
        /* read */ long timeElapsed = stopWatch.getTime(); // Get the elapsed time
        System.out.println("Time elapsed: " + timeElapsed + " ms");
    }
}