import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using the write method
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix using the read method
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix is a hypothetical method to read the matrix

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}