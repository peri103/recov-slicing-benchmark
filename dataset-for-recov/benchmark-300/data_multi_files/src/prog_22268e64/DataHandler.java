import java.util.LinkedList;

public class DataHandler {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void addData(int value) {
        /* write */ dataList.addFirst(value);
    }

    public int getData() {
        return dataList.getFirst();
    }
}
