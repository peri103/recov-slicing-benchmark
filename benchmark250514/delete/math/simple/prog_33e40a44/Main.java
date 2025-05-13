import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using MatrixUtils
        double[] diagonal = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Read the diagonal matrix using MatrixUtils
        /* read */ double[] retrievedDiagonal = matrix.getColumn(0);

        // Print the diagonal values to verify
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}