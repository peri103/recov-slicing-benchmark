import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal array
        double[] diagonal = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Extract the diagonal matrix using MatrixUtils (assuming getDiagonalMatrix is a valid method)
        /* read */ double[] extractedDiagonal = matrix.getColumn(0);

        // Print the extracted diagonal to verify
        for (double value : extractedDiagonal) {
            System.out.println(value);
        }
    }
}