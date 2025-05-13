import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to initialize the matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Use the write method to create a matrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Use the read method to get a block from the matrix
        /* read */ RealMatrix blockMatrix = matrix.getSubMatrix(0, 1, 0, 1);
        
        // Print the block matrix to verify the operations
        System.out.println("Block Matrix:");
        for (int i = 0; i < blockMatrix.getRowDimension(); i++) {
            for (int j = 0; j < blockMatrix.getColumnDimension(); j++) {
                System.out.print(blockMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}