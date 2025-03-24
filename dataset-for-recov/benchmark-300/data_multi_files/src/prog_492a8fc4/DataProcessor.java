import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class DataProcessor {
    private CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    public void processData(int value) {
        list.add(value);
    }

    public List<Integer> getProcessedData() {
        return list;
    }
}
