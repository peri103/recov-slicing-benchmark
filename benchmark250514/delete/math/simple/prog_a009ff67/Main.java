import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the write method
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Read the diagonal matrix using the read method
        /* read */ double[] readDiagonal = diagonalMatrix.getRow(0);

        // Print the diagonal values to verify
        for (double value : readDiagonal) {
            System.out.print(value + " ");
        }
    }
}