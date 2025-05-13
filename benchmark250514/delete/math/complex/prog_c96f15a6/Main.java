import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with some values
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 1.0, 0.0},
            {3.0, 2.0, 1.0}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some unrelated operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = triangularMatrix.operate(vector);
        
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More unrelated operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = triangularMatrix.add(identityMatrix);

        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}