import java.util.LinkedList;

public class DataManager {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void addData(int value) {
        /* write */ dataList.add(value);
    }

    public LinkedList<Integer> getDataList() {
        return dataList;
    }
}
