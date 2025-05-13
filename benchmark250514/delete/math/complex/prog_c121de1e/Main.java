import org.apache.commons.math3.linear.TriangularMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a TriangularMatrix
        TriangularMatrix matrix = new TriangularMatrix(3); // Assuming a 3x3 matrix

        // Initialize another matrix for additional operations
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(3, 3);

        // Perform some operations on the additional matrix
        additionalMatrix.setEntry(0, 0, 2.0);
        additionalMatrix.setEntry(1, 1, 4.0);
        additionalMatrix.setEntry(2, 2, 8.0);

        // Print the diagonal of the additional matrix
        for (int i = 0; i < 3; i++) {
            System.out.println("Diagonal entry of additionalMatrix at (" + i + ", " + i + "): " + additionalMatrix.getEntry(i, i));
        }

        // Perform a write operation on the main matrix
        /* write */ matrix.setEntry(0, 0, 5.0); // Set the entry at row 0, column 0 to 5.0

        // Perform some unrelated calculations
        double sum = 0.0;
        for (int i = 0; i < 3; i++) {
            sum += additionalMatrix.getEntry(i, i);
        }
        System.out.println("Sum of diagonal entries in additionalMatrix: " + sum);

        // Perform a read operation from the main matrix
        /* read */ double value = matrix.getEntry(0, 0); // Read the entry at row 0, column 0

        // Print the value read from the matrix
        System.out.println("Value read from matrix: " + value);

        // Perform additional operations to make the program more complex
        double[] vector = new double[] {1.0, 2.0, 3.0};
        RealMatrix vectorMatrix = new Array2DRowRealMatrix(vector);
        RealMatrix resultMatrix = additionalMatrix.multiply(vectorMatrix);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            System.out.println(resultMatrix.getEntry(i, 0));
        }
    }
}