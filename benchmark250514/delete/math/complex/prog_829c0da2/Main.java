import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values for the matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Initialize a vector with arbitrary values
        double[] vectorValues = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorValues);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Matrix-Vector Multiplication Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Create another matrix for additional operations
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);

        // Perform matrix addition
        RealMatrix addedMatrix = matrix.add(anotherMatrix);

        // Print the result of the matrix addition
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the diagonal values from the matrix
        /* read */ double[] retrievedDiagonalValues = matrix.getColumn(0);

        // Print the retrieved diagonal values
        System.out.println("Retrieved Diagonal Values:");
        for (double value : retrievedDiagonalValues) {
            System.out.println(value);
        }
    }
}