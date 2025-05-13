import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalData = {1.0, 2.0, 3.0};

        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalData);

        // Additional complex operations
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform a matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Create another matrix and add it to the original matrix
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Sum of matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the diagonal elements from the original matrix
        /* read */ double[] readData = MatrixUtils.getDiagonalMatrix(matrix).getData();

        // Print the diagonal elements
        System.out.println("Diagonal elements of the original matrix:");
        for (double value : readData) {
            System.out.println(value);
        }
    }
}