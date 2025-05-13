import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        int size = 3; // specify the size of the identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(size);

        // Read the identity matrix
        /* read */ RealMatrix retrievedMatrix = identityMatrix; // directly use the created matrix

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}