import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Use MatrixUtils to read the diagonal values from the matrix
        /* read */ double[] readDiagonalValues = matrix.getRow(0); // Assuming we want the first row which contains the diagonal values

        // Print the read diagonal values
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
    }
}