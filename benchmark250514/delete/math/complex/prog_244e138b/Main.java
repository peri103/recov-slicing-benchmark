import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to be used for creating a diagonal matrix
        double[] diagonal = {1.0, 2.0, 3.0};

        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Perform some unrelated operations
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Multiply the matrix with the vector
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Perform some matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);

        // Print the added matrix
        System.out.println("Added matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the diagonal matrix
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix would retrieve the diagonal

        // Print the retrieved diagonal elements
        System.out.println("Retrieved diagonal:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}