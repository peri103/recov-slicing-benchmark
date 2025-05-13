import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a column vector
        double[] columnData = {1.0, 2.0, 3.0};

        // Create a column real matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Create another matrix for operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(matrixData);

        // Perform matrix multiplication
        RealMatrix resultMatrix = anotherMatrix.multiply(matrix);

        // Create a vector for additional operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 0.5, 0.25});

        // Perform matrix-vector multiplication
        RealVector resultVector = anotherMatrix.operate(vector);

        // Get the column real matrix from the created matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);

        // Print the column matrix to verify
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }

        // Print the results of matrix multiplication
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the results of matrix-vector multiplication
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
    }
}