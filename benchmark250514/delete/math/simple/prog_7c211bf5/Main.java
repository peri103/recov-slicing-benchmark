import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to be used for the diagonal matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the specified write method
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Read the diagonal values from the matrix using the specified read method
        /* read */ double[] readDiagonalValues = matrix.getColumn(0); // Assuming we want to read the first column which is the diagonal

        // Print the read diagonal values
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
    }
}