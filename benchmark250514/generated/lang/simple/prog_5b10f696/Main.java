import org.apache.commons.lang3.time.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        /* write */ stopWatch.start();
        
        // Simulate some processing time
        for (int i = 0; i < 1000000; i++) {
            // Do nothing, just to consume some time
        }
        
        /* read */ long timeElapsed = stopWatch.getTime();
        System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    }
}