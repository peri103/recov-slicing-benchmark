import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix dimensions and data
        int rows = 2;
        int columns = 2;
        double[][] data = {
            {1.0, 0.0},
            {0.0, 1.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, data);

        // Create another matrix and vector
        double[][] anotherData = {
            {2.0, 3.0},
            {4.0, 5.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);

        double[] vectorData = {6.0, 7.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = anotherMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = anotherMatrix.multiply(sparseMatrix);

        // Print the multiplied matrix
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the matrix using MatrixUtils (in this hypothetical scenario)
        /* read */ RealMatrix retrievedMatrix = sparseMatrix; // Assuming getSparseMatrix() would return this

        // Print the matrix to verify
        System.out.println("Retrieved sparse matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}