import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to initialize the matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use MatrixUtils to create a BlockRealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Use MatrixUtils to retrieve the BlockRealMatrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData(), 0, 0, 2, 2);

        // Print the retrieved matrix to verify the read operation
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}