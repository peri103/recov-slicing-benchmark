import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for matrix creation
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use the write method to create a matrix
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Create a vector and perform operations
        double[] vectorData = {1.0, 2.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector transformedVector = matrix.operate(vector);

        // Use the read method to retrieve the matrix
        /* read */ RealMatrix retrievedMatrix = matrix;  // Since we are using the same instance, this is effectively the read operation

        // Print the retrieved matrix to verify the operation
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the transformed vector
        System.out.println("Transformed Vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.print(transformedVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}