import java.util.LinkedList;

public class DataManager {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void addData(int value) {
        /* write */ dataList.addFirst(value);
    }

    public int getFirstData() {
        return dataList.getFirst();
    }
}
