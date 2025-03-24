import java.util.Vector;

public class DataContainer {
    private Vector<Integer> data = new Vector<>();

    public void addData(int value) {
        /* write */ data.addElement(value);
    }

    public int getData(int index) {
        return data.elementAt(index);
    }

    public Vector<Integer> getAllData() {
        return data;
    }
}
