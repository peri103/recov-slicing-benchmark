import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize some data
        double[] diagonal = {1.0, 2.0, 3.0};
        double[] vectorData = {4.0, 5.0, 6.0};

        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        System.out.println("Added matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create and manipulate a vector
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the diagonal matrix using MatrixUtils
        /* read */ double[] retrievedDiagonal = matrix.getColumn(0);

        // Print the diagonal values to verify
        System.out.println("Retrieved diagonal:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }

        // Further operations using the retrieved diagonal
        double sumOfDiagonal = 0.0;
        for (double value : retrievedDiagonal) {
            sumOfDiagonal += value;
        }
        System.out.println("Sum of diagonal: " + sumOfDiagonal);
    }
}