import java.util.LinkedList;

public class DataProcessor {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void addData(int value) {
        /* write */ dataList.add(value);
    }

    public LinkedList<Integer> getDataList() {
        return dataList;
    }
}
