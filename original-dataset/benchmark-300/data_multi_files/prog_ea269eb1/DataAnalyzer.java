import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DataAnalyzer {
    private BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>(5);

    public void analyzeData(String data) throws InterruptedException {
        stringQueue.put(data);
    }

    public String getAnalyzedData() throws InterruptedException {
        return stringQueue.take();
    }
}
