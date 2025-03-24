import java.util.concurrent.BlockingQueue;

public class ResultAnalyzer {
    private BlockingQueue<Integer> queue;

    public ResultAnalyzer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int analyzeResult() throws InterruptedException {
        /* read */ int result = queue.take();
        return result;
    }
}
