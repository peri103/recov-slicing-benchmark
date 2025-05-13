import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using MatrixUtils
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Create another matrix for additional operations
        double[][] data = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(data);

        // Perform matrix addition
        RealMatrix resultMatrix = diagonalMatrix.add(anotherMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 0.0, -1.0});
        RealVector transformedVector = resultMatrix.operate(vector);

        // Print the transformed vector
        System.out.println("Transformed Vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.println(transformedVector.getEntry(i));
        }

        // Access the diagonal matrix again for reading
        /* read */ double[] retrievedDiagonal = diagonalMatrix.getRow(0);

        // Print the retrieved diagonal values
        System.out.println("Retrieved Diagonal Values:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }

        // Create a new diagonal matrix for additional complexity
        double[] newDiagonalValues = {4.0, 5.0, 6.0};
        RealMatrix newDiagonalMatrix = MatrixUtils.createDiagonalMatrix(newDiagonalValues);

        // Multiply matrices
        RealMatrix multipliedMatrix = newDiagonalMatrix.multiply(diagonalMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}