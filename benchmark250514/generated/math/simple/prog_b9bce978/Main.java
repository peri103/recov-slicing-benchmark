import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a SparseRealVector instance
        SparseRealVector vector = new OpenMapRealVector(10);

        // Use the write method to set a value in the vector
        /* write */ vector.setEntry(0, 3.14);

        // Use the read method to read the value from the vector
        /* read */ double value = vector.getEntry(0);

        // Print the value to ensure it was correctly read
        System.out.println(value);
    }
}