import java.util.Vector;

public class DataManager {
    private Vector<Integer> data = new Vector<>();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public Vector<Integer> getData() {
        return data;
    }
}
