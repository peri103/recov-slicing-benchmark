import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 array
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        // Use the write method to create a RealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Use the read method to get the same RealMatrix
        /* read */ RealMatrix readMatrix = matrix; // Assuming getRealMatrix is meant to return the matrix itself
        
        // Print the matrix to verify the read operation
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}