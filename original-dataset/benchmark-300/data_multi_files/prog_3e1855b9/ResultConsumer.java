import java.util.concurrent.BlockingQueue;

public class ResultConsumer {
    private BlockingQueue<Integer> queue;

    public ResultConsumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int consumeResult() throws InterruptedException {
        /* read */ int result = queue.take();
        return result;
    }
}
