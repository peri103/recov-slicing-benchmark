import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to be used for creating a diagonal matrix
        double[] diagonal = {1.0, 2.0, 3.0};

        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Read the diagonal matrix
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix would retrieve the diagonal

        // Print the retrieved diagonal elements
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}