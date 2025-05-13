import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{0, 0, 0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row vector
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowData);

        // Set the row vector to the first row of the matrix
        matrix.setRowVector(0, rowVector);

        // Get the row vector from the matrix
        /* read */ RealVector retrievedRowVector = matrix.getRowVector(0);

        // Print the retrieved row vector
        System.out.println(retrievedRowVector);
    }
}