import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    private List<String> stringList = new ArrayList<>();

    public void addToQueue(String value) {
        try {
            queue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void processQueue() {
        while (!queue.isEmpty()) {
            try {
                String element = queue.take();
                System.out.println("Queue Element: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void addToList(String value) {
        stringList.add(value);
    }

    public void processList() {
        for (String s : stringList) {
            System.out.println("List Element: " + s);
        }
    }
}
