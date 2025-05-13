import org.apache.commons.lang3.time.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        /* write */ stopWatch.start();
        
        // Simulate some elapsed time
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    }
}