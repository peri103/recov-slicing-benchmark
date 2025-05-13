import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using the write method
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Read the diagonal matrix using the read method
        /* read */ double[] retrievedDiagonal = diagonalMatrix.getColumn(0);

        // Print the retrieved diagonal values to ensure correctness
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}