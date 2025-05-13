import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the SparseRealMatrix with a specified size
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        // Write a value to the matrix at a specific position
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Read the value from the matrix at the same position
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify it was correctly written and read
        System.out.println(value);
    }
}