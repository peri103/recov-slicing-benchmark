import java.util.concurrent.CopyOnWriteArrayList;

public class DataManager {
    private CopyOnWriteArrayList<String> dataList = new CopyOnWriteArrayList<>();

    public void addData(String data) {
        /* write */ dataList.add(data);
    }

    public CopyOnWriteArrayList<String> getDataList() {
        return dataList;
    }
}
