import java.util.LinkedList;

public class DataReader {
    private LinkedList<Integer> dataList;

    public DataReader(LinkedList<Integer> dataList) {
        this.dataList = dataList;
    }

    public int readData(int index) {
        /* read */ return dataList.get(index);
    }
}
