import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Initialize a vector
        RealVector vector = new ArrayRealVector(3);

        // Set values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Create another matrix and perform operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Add the two matrices
        RealMatrix addedMatrix = matrix.add(anotherMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int row = 0; row < addedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < addedMatrix.getColumnDimension(); col++) {
                System.out.print(addedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println("Read Value: " + value);

        // Perform additional matrix operations
        RealMatrix multipliedMatrix = anotherMatrix.scalarMultiply(2.0);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}