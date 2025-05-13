import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealVector with size 1
        RealVector vector = new ArrayRealVector(1);

        // Initialize another RealVector with size 3
        RealVector anotherVector = new ArrayRealVector(3);
        anotherVector.setEntry(0, 10.0);
        anotherVector.setEntry(1, 20.0);
        anotherVector.setEntry(2, 30.0);

        // Initialize a RealMatrix with size 2x2
        RealMatrix matrix = new Array2DRowRealMatrix(2, 2);
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(0, 1, 2.0);
        matrix.setEntry(1, 0, 3.0);
        matrix.setEntry(1, 1, 4.0);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix resultMatrix = matrix.add(transposedMatrix);

        // Perform some operations on anotherVector
        RealVector scaledVector = anotherVector.mapMultiply(2.0);
        double dotProduct = anotherVector.dotProduct(scaledVector);

        // Print results of unrelated operations
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Dot Product: " + dotProduct);

        // Set the value at index 0 to 42.0
        /* write */ vector.setEntry(0, 42.0);

        // Some unrelated operations
        RealVector sumVector = anotherVector.add(scaledVector);
        System.out.println("Sum Vector:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.print(sumVector.getEntry(i) + " ");
        }
        System.out.println();

        // Get the value at index 0
        /* read */ double value = vector.getEntry(0);

        // Print the value
        System.out.println("Value from vector: " + value);
    }
}