import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        OpenMapRealVector vector = new OpenMapRealVector(10);
        /* write */ vector.setEntry(0, 3.14);
        /* read */ double value = vector.getEntry(0);
        System.out.println(value);
    }
}