import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal array
        double[] diagonal = {1.0, 2.0, 3.0};

        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Initialize another vector
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform a matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (double value : resultVector.toArray()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Perform some unrelated computations
        double sum = 0;
        for (int i = 0; i < vectorData.length; i++) {
            sum += vectorData[i] * vectorData[i];
        }
        System.out.println("Sum of squares of vector elements: " + sum);

        // Access and print the diagonal of the matrix
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix is intended to retrieve the diagonal
        System.out.println("Diagonal of the matrix:");
        for (double value : retrievedDiagonal) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Additional matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}