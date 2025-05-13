import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize dimensions and values for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 2.0, 0.0},
            {0.0, 0.0, 3.0}
        };

        // Create a sparse matrix using the data
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Additional code to make the program more complex
        // Create a dense vector
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform a matrix-vector multiplication
        RealVector resultVector = sparseMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Perform some operations with a new matrix
        double[][] newData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix newMatrix = MatrixUtils.createRealMatrix(newData);

        // Add the new matrix to the sparse matrix
        RealMatrix sumMatrix = sparseMatrix.add(newMatrix);

        // Print the sum matrix
        System.out.println("Sum of sparse matrix and new matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the sparse matrix
        /* read */ OpenMapRealMatrix retrievedMatrix = (OpenMapRealMatrix) sparseMatrix;

        // Print the retrieved matrix to verify the contents
        System.out.println("Retrieved sparse matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}