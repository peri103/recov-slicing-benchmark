import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        RealVector vector = new ArrayRealVector(1);
        /* write */ vector.setEntry(0, 42.0);
        /* read */ double value = vector.getEntry(0);
        System.out.println(value);
    }
}