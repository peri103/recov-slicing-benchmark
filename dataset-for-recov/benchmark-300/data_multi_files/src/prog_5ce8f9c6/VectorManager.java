import java.util.Vector;

public class VectorManager {
    private Vector vector = new Vector();

    public void addElement(Object obj) {
        /* write */ vector.addElement(obj);
    }

    public Object getElementAt(int index) {
        return vector.elementAt(index);
    }
}
