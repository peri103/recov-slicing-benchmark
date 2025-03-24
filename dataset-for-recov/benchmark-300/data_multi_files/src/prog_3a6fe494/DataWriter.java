import java.util.ArrayList;

public class DataWriter {
    private ArrayList<Integer> dataList = new ArrayList<>();

    public void writeData(int value) {
        /* write */ dataList.add(value);
    }

    public ArrayList<Integer> getDataList() {
        return dataList;
    }
}
