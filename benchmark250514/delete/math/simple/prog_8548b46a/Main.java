import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a RealVector from a row of the matrix
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(matrixData[1]);

        // Set the row vector back to the matrix at the same row index
        matrix.setRowVector(1, rowVector);

        // Read the row vector back from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector
        System.out.println(readVector);
    }
}