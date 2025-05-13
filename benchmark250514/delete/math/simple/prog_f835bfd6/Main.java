import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a row real matrix
        double[][] data = { { 1.0, 2.0, 3.0 } };
        
        // Create a row real matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Read the row real matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);
        
        // Print the matrix to verify
        System.out.println("Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}