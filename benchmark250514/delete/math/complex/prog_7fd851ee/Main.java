import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create another matrix for addition
        RealMatrix matrixA = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Perform matrix addition
        RealMatrix resultMatrix = identityMatrix.add(matrixA);

        // Create a vector for multiplication
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});

        // Perform matrix-vector multiplication
        RealVector resultVector = resultMatrix.operate(vector);

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = identityMatrix; // Since MatrixUtils does not have a getIdentityMatrix method, we directly use the created matrix

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create another identity matrix and multiply with resultMatrix
        RealMatrix anotherIdentityMatrix = MatrixUtils.createIdentityMatrix(3);
        RealMatrix multipliedMatrix = anotherIdentityMatrix.multiply(resultMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}