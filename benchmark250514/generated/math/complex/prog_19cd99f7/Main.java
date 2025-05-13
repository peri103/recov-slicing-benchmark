import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a square matrix with given dimensions
        int dimension = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 1.0, 0.0},
            {3.0, 2.0, 1.0}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = triangularMatrix.transpose();
        RealMatrix multipliedMatrix = triangularMatrix.multiply(transposedMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = multipliedMatrix.operate(vector);

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.createRealMatrix(triangularMatrix.getData());

        // Print the matrix to verify the operations
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional complex operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(dimension);
        RealMatrix addedMatrix = readMatrix.add(identityMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}