import java.util.Vector;

public class DataStorage {
    private Vector data = new Vector();

    public void storeData(int value) {
        /* write */ data.addElement(value);
    }

    public Vector getData() {
        return data;
    }
}
