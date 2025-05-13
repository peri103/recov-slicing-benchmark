import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a SparseRealMatrix instance
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        // Write a value into the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify
        System.out.println(value);
    }
}