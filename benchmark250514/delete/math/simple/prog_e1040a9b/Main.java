import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with some values
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Retrieve the triangular matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the retrieved matrix to verify the read operation
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}