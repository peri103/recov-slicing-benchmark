import java.util.LinkedList;

public class DataProcessor {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void addData(int data) {
        /* write */ dataList.addFirst(data);
    }

    public LinkedList<Integer> getDataList() {
        return dataList;
    }
}
