import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Additional operations: Create a vector and perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = identityMatrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform some arbitrary operations to increase complexity
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {2, 0, 1},
            {0, 3, 0},
            {1, 0, 2}
        });

        RealMatrix multipliedMatrix = anotherMatrix.multiply(identityMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix is a method that retrieves the matrix

        // Print the matrix to verify
        System.out.println("Identity matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}