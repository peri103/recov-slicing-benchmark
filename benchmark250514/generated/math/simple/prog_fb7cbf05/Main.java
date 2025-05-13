import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class Main {
    public static void main(String[] args) {
        SparseRealVector vector = new OpenMapRealVector(10);
        /* write */ vector.setEntry(0, 5.0);
        /* read */ double value = vector.getEntry(0);
        System.out.println(value);
    }
}