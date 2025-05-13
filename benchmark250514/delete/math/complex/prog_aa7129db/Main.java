import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with sample data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a triangular matrix using the write method
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Unrelated code: Create a vector and perform some operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Unrelated code: Calculate the transpose of the matrix
        RealMatrix transposeMatrix = triangularMatrix.transpose();
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transposeMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposeMatrix.getColumnDimension(); j++) {
                System.out.print(transposeMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // More unrelated code: Perform matrix addition
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = triangularMatrix.add(identityMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Output the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}