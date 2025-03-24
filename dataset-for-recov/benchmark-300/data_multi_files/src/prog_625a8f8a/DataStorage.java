import java.util.concurrent.CopyOnWriteArrayList;

public class DataStorage {
    private CopyOnWriteArrayList<Integer> data = new CopyOnWriteArrayList<>();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public CopyOnWriteArrayList<Integer> getData() {
        return data;
    }
}
