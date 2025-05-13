import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println(value);
    }
}