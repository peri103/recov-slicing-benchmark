import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{0, 0, 0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row vector
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowData);

        // Perform some unrelated operations on another matrix
        double[][] anotherMatrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealVector columnVector = anotherMatrix.getColumnVector(1);
        System.out.println("Column Vector: " + columnVector);

        // Set the row vector to the first row of the original matrix
        matrix.setRowVector(0, rowVector);

        // Perform some matrix multiplication
        RealMatrix resultMatrix = anotherMatrix.multiply(matrix);
        System.out.println("Result Matrix: ");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            System.out.println(resultMatrix.getRowVector(i));
        }

        // Get the row vector from the matrix
        /* read */ RealVector retrievedRowVector = matrix.getRowVector(0);

        // Print the retrieved row vector
        System.out.println("Retrieved Row Vector: " + retrievedRowVector);

        // Perform some operations on the retrieved row vector
        double norm = retrievedRowVector.getNorm();
        RealVector normalizedVector = retrievedRowVector.mapDivide(norm);
        System.out.println("Normalized Vector: " + normalizedVector);
    }
}