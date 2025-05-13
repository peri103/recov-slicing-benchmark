import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the array for the diagonal matrix
        double[] diagonal = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Perform some unrelated operations
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector operation
        System.out.println("Result of matrix-vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // More unrelated operations
        double scalar = 2.0;
        RealMatrix scaledMatrix = matrix.scalarMultiply(scalar);

        // Print the scaled matrix
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the diagonal matrix values
        /* read */ double[] retrievedDiagonal = matrix.getColumn(0); // Assuming the method to get diagonal elements

        // Print the retrieved diagonal values
        System.out.println("Retrieved diagonal values:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }

        // Additional complex operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);

        // Print the added matrix
        System.out.println("Matrix after addition with identity:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}