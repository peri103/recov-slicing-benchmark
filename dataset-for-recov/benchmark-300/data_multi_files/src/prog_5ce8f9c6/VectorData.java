import java.util.Vector;

public class VectorData {
    private Vector<Integer> data = new Vector<>();

    public void addData(int value) {
        /* write */ data.addElement(value);
    }

    public Vector<Integer> getData() {
        return data;
    }
}
