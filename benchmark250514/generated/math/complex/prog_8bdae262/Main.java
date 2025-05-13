import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the array for the RealVector
        double[] data = {1.0, 2.0, 3.0};

        // Create a RealVector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0); // Scale the vector
        RealVector addedVector = vector.add(scaledVector); // Add the scaled vector to the original

        // Create a RealMatrix from the vectors for additional complexity
        double[][] matrixData = {
            vector.toArray(),
            scaledVector.toArray(),
            addedVector.toArray()
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Perform matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Retrieve the RealVector using MatrixUtils (although there's no direct getRealVector method, we'll assume it's similar to accessing the vector directly)
        /* read */ RealVector retrievedVector = vector; // Directly accessing the created vector

        // Print the values from the retrieved vector to ensure correctness
        System.out.println("Retrieved Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }

        // Print the original matrix and its transpose
        System.out.println("Original Matrix:");
        for (int row = 0; row < matrix.getRowDimension(); row++) {
            for (int col = 0; col < matrix.getColumnDimension(); col++) {
                System.out.print(matrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplied Matrix:");
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}