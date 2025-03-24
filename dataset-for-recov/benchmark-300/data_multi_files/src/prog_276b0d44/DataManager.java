import java.util.LinkedList;

public class DataManager {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void addData(int data) {
        /* write */ dataList.addLast(data);
    }

    public LinkedList<Integer> getDataList() {
        return dataList;
    }
}
