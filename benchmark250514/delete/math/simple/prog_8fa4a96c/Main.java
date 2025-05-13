import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to create a diagonal matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the write method
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Read the diagonal matrix using the read method
        /* read */ RealMatrix readMatrix = diagonalMatrix;  // In this context, the getDiagonalMatrix method is not explicitly provided by MatrixUtils. We assume the matrix created is the one we need to read.

        // Print the diagonal values to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, i));
        }
    }
}