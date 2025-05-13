import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a block real matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use the write method to create a block real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Create a vector for additional operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform additional matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix inverseMatrix = MatrixUtils.inverse(transposedMatrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use the read method to retrieve the block real matrix
        /* read */ RealMatrix retrievedMatrix = matrix;

        // Output the value to ensure it is correct
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the inverse matrix
        System.out.println("Inverse of Transposed Matrix:");
        for (int i = 0; i < inverseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < inverseMatrix.getColumnDimension(); j++) {
                System.out.print(inverseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}