import java.util.Vector;

public class DataManager {
    private Vector data = new Vector();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public Vector getData() {
        return data;
    }
}
