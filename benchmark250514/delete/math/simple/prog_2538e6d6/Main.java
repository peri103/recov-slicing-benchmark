import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        RealMatrix identityMatrix;
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix using MatrixUtils (assuming getIdentityMatrix is a method to retrieve it)
        RealMatrix retrievedMatrix;
        /* read */ retrievedMatrix = identityMatrix; // Here we assume the identity matrix is returned directly

        // Print the retrieved matrix
        System.out.println("Identity Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}