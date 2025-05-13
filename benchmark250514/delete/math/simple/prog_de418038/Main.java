import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {0.0, 4.0, 5.0},
            {0.0, 0.0, 6.0}
        };

        // Create a triangular matrix
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Get the triangular matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}