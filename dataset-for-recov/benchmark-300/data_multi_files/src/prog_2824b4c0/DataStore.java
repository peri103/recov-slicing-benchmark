import java.util.concurrent.CopyOnWriteArrayList;

public class DataStore {
    private CopyOnWriteArrayList<Integer> data = new CopyOnWriteArrayList<>();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public int getData(int index) {
        return data.get(index);
    }
}
