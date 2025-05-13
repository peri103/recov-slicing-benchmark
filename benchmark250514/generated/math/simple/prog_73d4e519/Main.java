import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(2, 2);

        // Write a value into the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 3.14);

        // Read the value from the matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value
        System.out.println(value);
    }
}