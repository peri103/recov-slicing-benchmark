import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using MatrixUtils
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Read the diagonal matrix using MatrixUtils
        /* read */ double[] retrievedDiagonal = diagonalMatrix.getRow(0);
        
        // Print the retrieved diagonal values
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}