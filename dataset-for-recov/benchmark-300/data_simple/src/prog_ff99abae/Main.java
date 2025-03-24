import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        /* write */ vector.add(42);
        /* read */ int value = vector.get(0);
        System.out.println(value);
    }
}