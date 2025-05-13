import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a block real matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use the write method to create a block real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Use the read method to retrieve the block real matrix
        /* read */ RealMatrix retrievedMatrix = matrix;

        // Output the value to ensure it is correct
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}