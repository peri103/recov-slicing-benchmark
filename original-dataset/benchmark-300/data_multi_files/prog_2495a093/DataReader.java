import java.util.concurrent.CopyOnWriteArrayList;

public class DataReader {
    private CopyOnWriteArrayList<Integer> dataList;

    public DataReader(CopyOnWriteArrayList<Integer> dataList) {
        this.dataList = dataList;
    }

    public int readData() {
        /* read */ int value = dataList.get(0);
        return value;
    }
}
