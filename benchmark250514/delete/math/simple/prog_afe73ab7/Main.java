import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a RealMatrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row vector to be added to the matrix
        double[] rowVectorData = {7.0, 8.0, 9.0};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowVectorData);

        // Set the row vector into the matrix at a specific row index
        matrix.setRowVector(1, rowVector);

        // Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);
    }
}