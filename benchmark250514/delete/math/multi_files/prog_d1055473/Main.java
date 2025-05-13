import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create identity matrix
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createIdentityMatrix(3);

        // Use the identity matrix for operations
        RealMatrix identityMatrix = matrixOps.getIdentityMatrix();
        MatrixProcessor processor = new MatrixProcessor(identityMatrix);

        // Multiply identity matrix with vector
        RealVector resultVector = processor.multiplyWithVector(new double[] {1.0, 2.0, 3.0});
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Print the identity matrix
        System.out.println("Identity matrix:");
        /* read */ processor.printMatrix();
    }
}