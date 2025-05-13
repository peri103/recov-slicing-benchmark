import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using MatrixUtils
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Read the diagonal matrix using MatrixUtils (assuming getDiagonalMatrix is a hypothetical method)
        // Since MatrixUtils does not have a method named getDiagonalMatrix, we will use getData() to retrieve the matrix data
        /* read */ double[][] matrixData = diagonalMatrix.getData();
        
        // Print the diagonal matrix
        for (double[] row : matrixData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}