import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);

        // Perform some unrelated operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Resulting Vector: " + resultVector);

        // Set an entry in the matrix
        /* write */ matrix.setEntry(1, 5.0);

        // Perform more unrelated operations
        DiagonalMatrix anotherMatrix = new DiagonalMatrix(new double[]{3.0, 4.0, 5.0});
        RealVector anotherResultVector = anotherMatrix.operate(vector);
        System.out.println("Another Resulting Vector: " + anotherResultVector);

        // Read the entry from the matrix
        /* read */ double value = matrix.getEntry(1);
        System.out.println("Read Value: " + value);

        // Additional operations with vectors
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = scaledVector.add(new ArrayRealVector(new double[]{1.0, 1.0, 1.0}));
        System.out.println("Added Vector: " + addedVector);

        // More matrix operations
        DiagonalMatrix scaledMatrix = new DiagonalMatrix(new double[]{2.0, 2.0, 2.0});
        RealVector finalResultVector = scaledMatrix.operate(addedVector);
        System.out.println("Final Resulting Vector: " + finalResultVector);
    }
}