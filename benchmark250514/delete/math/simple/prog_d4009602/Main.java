import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for creating a matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use MatrixUtils to create a BlockRealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Retrieve the matrix using getBlockRealMatrix, though this method is not standard in MatrixUtils,
        // we assume it is a method to get the matrix back for the purpose of the example.
        /* read */ RealMatrix retrievedMatrix = matrix; // Assuming getBlockRealMatrix would return the matrix itself

        // Output the retrieved matrix
        System.out.println(retrievedMatrix);
    }
}