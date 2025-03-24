import java.util.concurrent.SynchronousQueue;

public class StringProcessor {
    private SynchronousQueue<String> queue = new SynchronousQueue<>();

    public void writeString(String message) {
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String readString() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null; // Return a default value in case of error
        }
    }
}
