import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a RealVector using createRowRealVector method from MatrixUtils
        double[] rowData = {7.0, 8.0, 9.0};
        /* write */ RealVector vector = MatrixUtils.createRowRealVector(rowData);

        // Set the vector as a row in the matrix
        matrix.setRowVector(1, vector);

        // Read the vector from the matrix using getRowVector method
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector
        System.out.println(readVector);
    }
}