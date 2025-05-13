import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Additional code using a vector for more complexity
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = identityMatrix.operate(vector);

        // Print the result of multiplying the identity matrix with a vector
        System.out.println("Resulting vector after multiplying with identity matrix: " + resultVector);

        // Further operations to increase complexity
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        
        RealMatrix matrixB = MatrixUtils.createRealMatrix(new double[][]{
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        });

        // Matrix addition
        RealMatrix matrixC = matrixA.add(matrixB);
        System.out.println("Matrix C (A + B):");
        for (int i = 0; i < matrixC.getRowDimension(); i++) {
            for (int j = 0; j < matrixC.getColumnDimension(); j++) {
                System.out.print(matrixC.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Matrix multiplication
        RealMatrix matrixD = matrixA.multiply(matrixB);
        System.out.println("Matrix D (A * B):");
        for (int i = 0; i < matrixD.getRowDimension(); i++) {
            for (int j = 0; j < matrixD.getColumnDimension(); j++) {
                System.out.print(matrixD.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the identity matrix using a custom method
        /* read */ RealMatrix retrievedMatrix = getIdentityMatrix(identityMatrix);

        // Print the retrieved matrix to verify it is the same as the one created
        System.out.println("Retrieved identity matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }

    // Custom method to mimic the behavior of "getIdentityMatrix"
    public static RealMatrix getIdentityMatrix(RealMatrix matrix) {
        return matrix;
    }
}