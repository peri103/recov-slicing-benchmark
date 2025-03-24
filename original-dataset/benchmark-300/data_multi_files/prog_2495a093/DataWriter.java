import java.util.concurrent.CopyOnWriteArrayList;

public class DataWriter {
    private CopyOnWriteArrayList<Integer> dataList = new CopyOnWriteArrayList<>();

    public void writeData(int value) {
        /* write */ dataList.add(value);
    }

    public CopyOnWriteArrayList<Integer> getDataList() {
        return dataList;
    }
}
