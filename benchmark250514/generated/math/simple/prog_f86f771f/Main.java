import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Set a value in the matrix
        /* write */ matrix.setEntry(1, 1, 5.5);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println(value);
    }
}