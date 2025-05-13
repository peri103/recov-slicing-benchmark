import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array of doubles
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create a BlockRealMatrix using the MatrixUtils class
        /* write */ BlockRealMatrix matrix = (BlockRealMatrix) MatrixUtils.createBlockRealMatrix(data);

        // Retrieve the BlockRealMatrix using the MatrixUtils class
        /* read */ BlockRealMatrix retrievedMatrix = (BlockRealMatrix) MatrixUtils.getBlockRealMatrix(matrix.getData());

        // Print the retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}