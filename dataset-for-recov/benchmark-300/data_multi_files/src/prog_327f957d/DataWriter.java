import java.util.LinkedList;

public class DataWriter {
    private LinkedList<Integer> dataList;

    public DataWriter(LinkedList<Integer> dataList) {
        this.dataList = dataList;
    }

    public void writeData(int value) {
        /* write */ dataList.add(value);
    }
}
