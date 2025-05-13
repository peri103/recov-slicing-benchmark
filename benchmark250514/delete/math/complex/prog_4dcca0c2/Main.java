import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.SingularValueDecomposition;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using the MatrixUtils class
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = identityMatrix.operate(vector);
        
        // Print the result of the vector operation
        System.out.println("Result of identity matrix and vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform a Singular Value Decomposition on the identity matrix
        SingularValueDecomposition svd = new SingularValueDecomposition(identityMatrix);
        RealMatrix uMatrix = svd.getU();
        RealMatrix sMatrix = svd.getS();
        RealMatrix vMatrix = svd.getV();

        // Print the singular value decomposition matrices
        System.out.println("U matrix:");
        printMatrix(uMatrix);
        System.out.println("S matrix:");
        printMatrix(sMatrix);
        System.out.println("V matrix:");
        printMatrix(vMatrix);

        // Read the matrix to verify it is the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix; // Assume getIdentityMatrix() returns the matrix itself

        // Display the matrix to verify its identity
        System.out.println("Read identity matrix:");
        printMatrix(readMatrix);
    }

    // Helper method to print a matrix
    private static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}