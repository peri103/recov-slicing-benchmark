import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a new DiagonalMatrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);

        // Create a new Array2DRowRealMatrix with size 3x3
        RealMatrix matrix2 = new Array2DRowRealMatrix(3, 3);

        // Fill the Array2DRowRealMatrix with values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2.setEntry(i, j, i + j);
            }
        }

        // Perform some operations on matrix2
        RealMatrix transposedMatrix = matrix2.transpose();
        RealMatrix addedMatrix = matrix2.add(transposedMatrix);

        // Print the addedMatrix to check the result
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Write a value to the DiagonalMatrix at position (1, 1)
        /* write */ matrix.setEntry(1, 5.0);

        // Perform some unrelated operations
        double determinant = matrix2.getDeterminant();
        System.out.println("Determinant of matrix2: " + determinant);

        RealMatrix multipliedMatrix = matrix2.multiply(matrix2);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the DiagonalMatrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1);

        // Print the value to ensure the read method works correctly
        System.out.println("Read value from DiagonalMatrix: " + value);
    }
}