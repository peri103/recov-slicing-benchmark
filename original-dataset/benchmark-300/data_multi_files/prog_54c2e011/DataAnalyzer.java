import java.util.concurrent.LinkedBlockingDeque;

public class DataAnalyzer {
    private LinkedBlockingDeque<Integer> deque;

    public DataAnalyzer(LinkedBlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    public int analyzeData() throws InterruptedException {
        return deque.takeLast();
    }
}
