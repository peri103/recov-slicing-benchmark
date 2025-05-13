import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Creating an identity matrix using the MatrixUtils class
        RealMatrix identityMatrix;
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Reading the identity matrix
        RealMatrix readMatrix;
        /* read */ readMatrix = identityMatrix;
        
        // Printing the matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}