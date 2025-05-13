import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using MatrixUtils
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Retrieve the diagonal matrix using a method (assuming getDiagonalMatrix is a hypothetical method)
        // Since there is no actual getDiagonalMatrix method in MatrixUtils, we will directly use the matrix created
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // For demonstration, we get the first row

        // Print the diagonal values
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}