import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value to verify
        System.out.println(value);
    }
}