import java.util.LinkedList;

public class DataWriter {
    private LinkedList<Integer> dataList = new LinkedList<>();

    public void writeData(int value) {
        /* write */ dataList.add(value);
    }

    public LinkedList<Integer> getDataList() {
        return dataList;
    }
}
