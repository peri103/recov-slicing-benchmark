import java.util.ArrayList;
import java.util.LinkedList;

public class DataProcessor {
    private ArrayList<Integer> list = new ArrayList<>();
    private LinkedList<Integer> queue = new LinkedList<>();

    public void initializeData() {
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            queue.add(i * 20);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public LinkedList<Integer> getQueue() {
        return queue;
    }
}
