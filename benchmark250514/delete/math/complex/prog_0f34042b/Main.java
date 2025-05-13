import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Perform some unrelated operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });

        RealVector resultVector = matrix.operate(vector);
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More unrelated operations
        RealMatrix randomMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {3, 2, 1},
            {1, 0, 2},
            {0, 1, 3}
        });
        RealMatrix multipliedMatrix = randomMatrix.multiply(identityMatrix);

        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix returns the created matrix

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