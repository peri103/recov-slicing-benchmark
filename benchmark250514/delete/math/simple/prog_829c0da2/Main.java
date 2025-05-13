import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values for the matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Retrieve the diagonal values from the matrix
        /* read */ double[] retrievedDiagonalValues = matrix.getColumn(0);

        // Print the retrieved diagonal values
        for (double value : retrievedDiagonalValues) {
            System.out.println(value);
        }
    }
}