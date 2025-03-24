import java.util.LinkedList;

public class DataManager {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void addData(int value) {
        /* write */ dataList.addFirst(value);
    }

    public int getFirstData() {
        /* read */ return dataList.getFirst();
    }

    public LinkedList<Integer> getDataList() {
        return dataList;
    }
}
