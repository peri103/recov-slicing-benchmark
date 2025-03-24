import java.util.concurrent.CopyOnWriteArrayList;

public class DataStore {
    private CopyOnWriteArrayList<Integer> dataList = new CopyOnWriteArrayList<>();

    public void addData(int value) {
        /* write */ dataList.add(value);
    }

    public int getData(int index) {
        return dataList.get(index);
    }
}
