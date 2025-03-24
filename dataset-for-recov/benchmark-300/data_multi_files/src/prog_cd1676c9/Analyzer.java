import java.util.concurrent.LinkedBlockingDeque;

public class Analyzer {
    private LinkedBlockingDeque<Integer> dataQueue;

    public Analyzer(LinkedBlockingDeque<Integer> dataQueue) {
        this.dataQueue = dataQueue;
    }

    public int analyze() throws InterruptedException {
        /* read */ return dataQueue.takeFirst();
    }
}
