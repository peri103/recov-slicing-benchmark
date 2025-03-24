import java.util.concurrent.SynchronousQueue;

public class DataConsumer {
    private SynchronousQueue<Integer> queue;

    public DataConsumer(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    public void consumeData() {
        // Thread to read from the queue
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the reader thread
        reader.start();

        // Wait for the reader thread to finish
        try {
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
