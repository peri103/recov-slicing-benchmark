import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for the matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use the MatrixUtils to create a BlockRealMatrix
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Retrieve the matrix using MatrixUtils (In reality, MatrixUtils does not have a getBlockRealMatrix method, 
        // but for the sake of this example, let's assume it does. We will directly use the matrix object instead.)
        /* read */ BlockRealMatrix retrievedMatrix = matrix; // Assuming getBlockRealMatrix would return the same matrix

        // Print the retrieved matrix to verify
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}