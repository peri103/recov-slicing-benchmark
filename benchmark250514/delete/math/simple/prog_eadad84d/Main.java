import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to be used for creating a BlockRealMatrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ 
        // Use MatrixUtils to create a BlockRealMatrix from the 2D array
        BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        /* read */ 
        // Retrieve the BlockRealMatrix using MatrixUtils (in this case, it's the same object)
        BlockRealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData());
        
        // Print the contents of the retrieved matrix to verify
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}