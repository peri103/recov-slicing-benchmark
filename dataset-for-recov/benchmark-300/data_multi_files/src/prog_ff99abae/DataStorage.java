import java.util.Vector;

public class DataStorage {
    private Vector<Integer> data = new Vector<>();

    public void storeData(int value) {
        /* write */ data.add(value);
    }

    public Vector<Integer> getData() {
        return data;
    }
}
