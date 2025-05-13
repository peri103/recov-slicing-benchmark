import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix dimensions
        int rows = 3;
        int columns = 3;

        // Create a triangular matrix with specified dimensions
        RealMatrix triangularMatrix = MatrixUtils.createRealMatrix(rows, columns);
        
        // Fill the matrix with some values to make it triangular
        triangularMatrix.setEntry(0, 0, 1.0);
        triangularMatrix.setEntry(1, 0, 0.0);
        triangularMatrix.setEntry(1, 1, 2.0);
        triangularMatrix.setEntry(2, 0, 0.0);
        triangularMatrix.setEntry(2, 1, 0.0);
        triangularMatrix.setEntry(2, 2, 3.0);
        
        /* write */ MatrixUtils.createTriangularMatrix(triangularMatrix);

        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify it was correctly read
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}