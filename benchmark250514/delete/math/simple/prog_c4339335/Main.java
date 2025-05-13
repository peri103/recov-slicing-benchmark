import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to create a diagonal matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Read the diagonal matrix using the MatrixUtils class
        /* read */ double[] readDiagonal = matrix.getRow(0); // Using getRow to simulate reading the diagonal matrix

        // Print the diagonal values
        for (double value : readDiagonal) {
            System.out.println(value);
        }
    }
}