import java.util.concurrent.BlockingQueue;

public class ResultChecker {
    private BlockingQueue<Integer> queue;

    public ResultChecker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int checkResult() throws InterruptedException {
        /* read */ return queue.take();
    }
}
