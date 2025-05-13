import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 identity matrix
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        
        // Create a triangular matrix using the data
        /* write */ RealMatrix matrix = MatrixUtils.createTriangularMatrix(data);

        // Retrieve the triangular matrix
        /* read */ RealMatrix triangularMatrix = MatrixUtils.getTriangularMatrix(matrix);

        // Print the triangular matrix
        for (int i = 0; i < triangularMatrix.getRowDimension(); i++) {
            for (int j = 0; j < triangularMatrix.getColumnDimension(); j++) {
                System.out.print(triangularMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}