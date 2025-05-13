import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Read the diagonal matrix using MatrixUtils (assuming getDiagonalMatrix is a hypothetical method)
        /* read */ double[] readValues = matrix.getColumn(0); // Using getColumn(0) to simulate reading diagonal values

        // Print the read diagonal values
        for (double value : readValues) {
            System.out.println(value);
        }
    }
}