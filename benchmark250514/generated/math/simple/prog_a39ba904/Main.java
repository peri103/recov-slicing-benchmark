import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for matrix creation
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use the write method to create a matrix
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Use the read method to retrieve the matrix
        /* read */ RealMatrix retrievedMatrix = matrix;  // Since we are using the same instance, this is effectively the read operation

        // Print the retrieved matrix to verify the operation
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}