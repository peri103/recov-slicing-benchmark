import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define the size of the matrix
        int rows = 3;
        int columns = 3;

        // Create a triangular matrix using MatrixUtils
        double[][] data = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createRealMatrix(data);

        // Read the triangular matrix
        /* read */ RealMatrix readMatrix = triangularMatrix; // Assuming getTriangularMatrix returns the same matrix

        // Print the matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}