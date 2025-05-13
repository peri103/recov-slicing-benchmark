import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        RealVector vector = new ArrayRealVector(1); // Initialize vector with size 1
        RealVector vector2 = new ArrayRealVector(3); // Another vector for additional operations
        RealMatrix matrix = MatrixUtils.createRealMatrix(2, 2); // A 2x2 matrix for complexity

        // Perform some operations on vector2
        vector2.setEntry(0, 10.0);
        vector2.setEntry(1, 20.0);
        vector2.setEntry(2, 30.0);

        // Perform some operations on the matrix
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(0, 1, 2.0);
        matrix.setEntry(1, 0, 3.0);
        matrix.setEntry(1, 1, 4.0);

        // Print matrix entries
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.println("Matrix entry (" + i + "," + j + "): " + matrix.getEntry(i, j));
            }
        }

        /* write */ vector.setEntry(0, 42.0); // Set the entry at index 0

        // Perform some calculations with vector2
        double sum = 0;
        for (int i = 0; i < vector2.getDimension(); i++) {
            sum += vector2.getEntry(i);
        }
        System.out.println("Sum of vector2 entries: " + sum);

        // More operations on vector2
        vector2.mapMultiplyToSelf(2.0); // Multiply each entry by 2
        for (int i = 0; i < vector2.getDimension(); i++) {
            System.out.println("Doubled vector2 entry " + i + ": " + vector2.getEntry(i));
        }

        /* read */ double value = vector.getEntry(0); // Get the entry at index 0
        System.out.println("Read value from vector: " + value);

        // Perform additional operations with the original vector
        vector.mapAddToSelf(5.0); // Add 5 to each entry
        System.out.println("Vector after adding 5: " + vector.getEntry(0));
    }
}