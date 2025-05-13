import org.apache.commons.math3.linear.TriangularMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the TriangularMatrix with a size for demonstration purposes
        int size = 3;
        TriangularMatrix matrix = new TriangularMatrix(size);

        // Initialize another matrix for additional complexity
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(size, size);
        
        // Populate additionalMatrix with values
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                additionalMatrix.setEntry(i, j, i + j);
            }
        }

        // Write a value to the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Perform some operations on additionalMatrix
        RealMatrix transposedMatrix = additionalMatrix.transpose();
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += transposedMatrix.getEntry(i, j);
            }
        }

        // Print the sum of all entries in the transposed matrix
        System.out.println("Sum of transposed matrix entries: " + sum);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the read value
        System.out.println("Value from TriangularMatrix: " + value);

        // Further operations on the original matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                matrix.setEntry(i, j, i * j + 1.0);
            }
        }

        // Print all entries from the triangular matrix
        System.out.println("Entries from TriangularMatrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}