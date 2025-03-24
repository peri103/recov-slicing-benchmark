import java.util.LinkedList;

public class DataStore {
    private LinkedList<Integer> data = new LinkedList<>();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public int getData(int index) {
        return data.get(index);
    }
}
