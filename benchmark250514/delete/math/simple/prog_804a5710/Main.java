import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the dimensions of the identity matrix
        int dimension = 3;

        // Create an identity matrix using the write method
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(dimension);

        // Read the identity matrix using the read method
        /* read */ RealMatrix retrievedMatrix = identityMatrix; // Assuming getIdentityMatrix is a custom method to retrieve the matrix

        // Print the matrix to verify
        for (int row = 0; row < retrievedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < retrievedMatrix.getColumnDimension(); col++) {
                System.out.print(retrievedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}