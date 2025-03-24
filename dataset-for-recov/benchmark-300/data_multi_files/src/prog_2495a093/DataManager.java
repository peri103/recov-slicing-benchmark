import java.util.concurrent.CopyOnWriteArrayList;

public class DataManager {
    private CopyOnWriteArrayList<Integer> dataList = new CopyOnWriteArrayList<>();

    public void addData(int value) {
        /* write */ dataList.add(value);
    }

    public CopyOnWriteArrayList<Integer> getDataList() {
        return dataList;
    }
}
