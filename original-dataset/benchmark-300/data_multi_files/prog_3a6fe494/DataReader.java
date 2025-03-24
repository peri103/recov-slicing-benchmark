import java.util.ArrayList;

public class DataReader {
    private ArrayList<Integer> dataList;

    public DataReader(ArrayList<Integer> dataList) {
        this.dataList = dataList;
    }

    public int readData() {
        /* read */ return dataList.get(0);
    }
}
