import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create a block real matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Read the matrix using the read method (Note: Assuming the read method is similar to obtaining the matrix)
        /* read */ RealMatrix readMatrix = matrix; // In this context, directly using the matrix as the read method

        // Print the matrix to verify the read operation
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}