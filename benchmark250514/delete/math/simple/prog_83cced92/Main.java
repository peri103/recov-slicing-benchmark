import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a BlockRealMatrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use MatrixUtils to create a BlockRealMatrix
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Use MatrixUtils to retrieve the BlockRealMatrix
        /* read */ BlockRealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData());

        // Print the retrieved matrix to verify the result
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}