import java.util.LinkedList;
import java.util.Queue;

public class DataProcessor {
    private Queue<Integer> queue = new LinkedList<>();

    public void enqueueData(int data) {
        queue.add(data);
    }

    public void transferData(DataStack dataStack) {
        while (!queue.isEmpty()) {
            int element = queue.poll();
            dataStack.pushData(element);
        }
    }
}
