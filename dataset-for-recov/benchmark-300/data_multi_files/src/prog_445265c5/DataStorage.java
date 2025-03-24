import java.util.LinkedList;

public class DataStorage {
    private LinkedList<Integer> data = new LinkedList<>();

    public void storeData(int value) {
        /* write */ data.add(value);
    }

    public LinkedList<Integer> getData() {
        return data;
    }
}
