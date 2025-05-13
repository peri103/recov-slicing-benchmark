import org.apache.commons.lang3.time.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        /* write */ stopWatch.start();
        
        // Simulate some elapsed time
        for (int i = 0; i < 1000000; i++); // Busy-wait loop
        
        /* read */ long elapsedTime = stopWatch.getTime();
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}