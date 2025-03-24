import java.util.LinkedList;

public class DataStorage {
    private LinkedList<Integer> data = new LinkedList<>();

    public void storeData(int value) {
        /* write */ data.addFirst(value);
    }

    public LinkedList<Integer> getData() {
        return data;
    }
}
