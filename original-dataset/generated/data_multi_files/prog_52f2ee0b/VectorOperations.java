import java.util.Vector;

public class VectorOperations {
    private Vector<Integer> vector = new Vector<>();

    public void addElement(int element) {
        /* write */ vector.addElement(element);
    }

    public int getElement(int index) {
        return vector.elementAt(index);
    }
}
