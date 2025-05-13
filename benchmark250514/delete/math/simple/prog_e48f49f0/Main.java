import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix variable
        RealMatrix identityMatrix;
        
        // Create an identity matrix
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);
        
        // Retrieve the identity matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getIdentityMatrix(identityMatrix);
        
        // Print the retrieved matrix
        System.out.println(retrievedMatrix);
    }
}