import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3); // Initialize a 3x3 sparse matrix
        /* write */ matrix.setEntry(1, 1, 5.5); // Set the value 5.5 at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1); // Read the value at position (1, 1)
        System.out.println(value); // Output the value
    }
}