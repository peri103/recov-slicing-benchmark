import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        /* write */ vector.addElement(1);
        /* read */ int value = (Integer) vector.elementAt(0);
        System.out.println(value);
    }
}