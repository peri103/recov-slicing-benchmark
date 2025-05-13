import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);
        
        // Additional operations to make the program more complex
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Perform matrix multiplication
        RealMatrix resultMatrix = matrixA.multiply(identityMatrix);

        // Create a vector and perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector multipliedVector = matrixA.operate(vector);

        // Displaying the result of matrix multiplication
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Displaying the result of matrix-vector multiplication
        System.out.println("Multiplied Vector:");
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.print(multipliedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Reading the identity matrix (assuming getIdentityMatrix is a valid method)
        // Note: MatrixUtils does not have a getIdentityMatrix method in reality, this is hypothetical.
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix(identityMatrix) returns the same matrix

        // Displaying the identity matrix
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}