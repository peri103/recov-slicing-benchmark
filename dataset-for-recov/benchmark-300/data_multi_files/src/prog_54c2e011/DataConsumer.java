import java.util.concurrent.LinkedBlockingDeque;

public class DataConsumer {
    public void consumeData(LinkedBlockingDeque<Integer> deque) throws InterruptedException {
        /* read */ int data = deque.takeLast();
        System.out.println("Data consumed from the deque: " + data);
    }
}
