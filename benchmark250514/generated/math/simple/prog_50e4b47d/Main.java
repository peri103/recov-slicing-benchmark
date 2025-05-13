import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        RealVector vector = new ArrayRealVector(1); // Initialize vector with size 1
        /* write */ vector.setEntry(0, 42.0); // Set the entry at index 0
        /* read */ double value = vector.getEntry(0); // Get the entry at index 0
        System.out.println(value);
    }
}