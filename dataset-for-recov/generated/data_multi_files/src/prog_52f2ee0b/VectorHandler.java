import java.util.Vector;

public class VectorHandler {
    private Vector<Integer> vector = new Vector<>();

    public void addElement(int element) {
        /* write */ vector.addElement(element);
    }

    public int getElementAt(int index) {
        return vector.elementAt(index);
    }
}
