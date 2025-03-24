import java.util.concurrent.SynchronousQueue;

public class DataProcessor {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void writeData(int value) {
        new Thread(() -> {
            try {
                /* write */ queue.put(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public int readData() {
        try {
            /* read */ return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
