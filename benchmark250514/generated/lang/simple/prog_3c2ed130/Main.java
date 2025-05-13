import org.apache.commons.lang3.time.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        /* write */ stopWatch.start();
        
        // Simulating some operation
        for (int i = 0; i < 1000000; i++) {
            // Just a dummy loop to pass some time
        }
        
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    }
}