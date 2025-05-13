import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a triangular matrix
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };
        
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Read the triangular matrix (assuming a method exists to get it back, for example purposes)
        /* read */ RealMatrix readMatrix = triangularMatrix; // As an example, directly using the matrix created

        // Print the matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}