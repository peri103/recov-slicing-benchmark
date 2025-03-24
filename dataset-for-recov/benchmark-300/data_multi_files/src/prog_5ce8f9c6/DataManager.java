import java.util.Vector;

public class DataManager {
    private Vector dataVector = new Vector();

    public void addData(Object data) {
        /* write */ dataVector.addElement(data);
    }

    public Vector getDataVector() {
        return dataVector;
    }
}
