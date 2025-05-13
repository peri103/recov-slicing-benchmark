import org.apache.commons.lang3.time.StopWatch;

public class StopWatchHandler {
    private StopWatch stopWatch = new StopWatch();

    public void startTimer() {
        /* write */ stopWatch.start();
    }

    public long getElapsedTime() {
        /* read */ return stopWatch.getTime();
    }
}
