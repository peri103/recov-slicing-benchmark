import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        /* write */ vector.add(1);
        /* read */ int value = (Integer) vector.get(0);
        System.out.println(value);
    }
}