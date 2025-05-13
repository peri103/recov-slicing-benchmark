import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);
        
        // Read the identity matrix (assuming the method getIdentityMatrix exists, but it doesn't in reality)
        // This is a hypothetical example as MatrixUtils doesn't have a getIdentityMatrix method.
        // However, for the sake of this task, we will simulate the read operation.
        /* read */ RealMatrix readMatrix = identityMatrix; // Simulating the read operation
        
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