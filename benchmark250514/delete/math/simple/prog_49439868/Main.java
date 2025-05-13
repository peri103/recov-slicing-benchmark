import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the diagonal matrix
        double[] diagonalData = {1.0, 2.0, 3.0};

        // Create the diagonal matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalData);

        // Read the diagonal matrix using the read method
        /* read */ double[] readDiagonal = matrix.getColumn(0);

        // Print the read values to verify correctness
        for (double value : readDiagonal) {
            System.out.println(value);
        }
    }
}