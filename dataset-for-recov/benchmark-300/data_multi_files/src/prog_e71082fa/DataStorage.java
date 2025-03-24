import java.util.LinkedList;

public class DataStorage {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void storeData(int data) {
        /* write */ dataList.addLast(data);
    }

    public LinkedList<Integer> getDataList() {
        return dataList;
    }
}
