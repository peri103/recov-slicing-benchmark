import java.util.concurrent.BlockingDeque;

public class DataAnalyzer {
    private BlockingDeque<Integer> deque;

    public DataAnalyzer(BlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public int analyzeData() throws InterruptedException {
        /* read */ return deque.takeFirst();
    }
}
