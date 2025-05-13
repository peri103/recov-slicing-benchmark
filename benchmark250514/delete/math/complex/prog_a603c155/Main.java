import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        int size = 3; // specify the size of the identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(size);

        // Create a vector
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        System.out.println("Vector:");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.print(vector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix-vector multiplication
        RealVector resultVector = identityMatrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Some unrelated operations to increase complexity
        RealMatrix matrixB = MatrixUtils.createRealMatrix(new double[][]{
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        });

        RealMatrix matrixC = identityMatrix.add(matrixB);
        System.out.println("Matrix C (Identity + B):");
        for (int i = 0; i < matrixC.getRowDimension(); i++) {
            for (int j = 0; j < matrixC.getColumnDimension(); j++) {
                System.out.print(matrixC.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix
        /* read */ RealMatrix retrievedMatrix = identityMatrix; // directly use the created matrix

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}