import java.util.concurrent.CopyOnWriteArrayList;

public class DataManager {
    private CopyOnWriteArrayList<Integer> dataList = new CopyOnWriteArrayList<>();

    public void addData(int data) {
        /* write */ dataList.add(data);
    }

    public CopyOnWriteArrayList<Integer> getDataList() {
        return dataList;
    }
}
