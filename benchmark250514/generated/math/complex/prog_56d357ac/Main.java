import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(3, 3);
        RealVector vector = new ArrayRealVector(3);

        // Initialize matrix2 with some values
        for (int i = 0; i < matrix2.getRowDimension(); i++) {
            for (int j = 0; j < matrix2.getColumnDimension(); j++) {
                matrix2.setEntry(i, j, i * j + 1.0);
            }
        }

        // Set an entry in the original matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform some operations with vector and matrix2
        for (int i = 0; i < vector.getDimension(); i++) {
            vector.setEntry(i, i + 2.0);
        }

        RealVector resultVector = matrix2.operate(vector);

        // Print the result of vector operations
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result vector entry " + i + ": " + resultVector.getEntry(i));
        }

        // Perform a calculation using the original matrix
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j) * matrix2.getEntry(i, j);
            }
        }

        // Read the entry set earlier
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Read value: " + value);

        // Print the sum of multiplied matrices
        System.out.println("Sum of multiplied matrices: " + sum);

        // More complex operations
        RealMatrix matrix3 = MatrixUtils.createRealMatrix(3, 3);
        for (int i = 0; i < matrix3.getRowDimension(); i++) {
            for (int j = 0; j < matrix3.getColumnDimension(); j++) {
                matrix3.setEntry(i, j, matrix2.getEntry(i, j) + matrix.getEntry(i, j));
            }
        }

        // Print matrix3
        for (int i = 0; i < matrix3.getRowDimension(); i++) {
            for (int j = 0; j < matrix3.getColumnDimension(); j++) {
                System.out.println("matrix3 entry (" + i + ", " + j + "): " + matrix3.getEntry(i, j));
            }
        }
    }
}