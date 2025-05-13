import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Creating an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);
        
        // Reading the identity matrix using MatrixUtils (assuming getIdentityMatrix is a valid method)
        // Note: MatrixUtils does not have a getIdentityMatrix method in reality, this is hypothetical.
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix(identityMatrix) returns the same matrix

        // Displaying the matrix
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}