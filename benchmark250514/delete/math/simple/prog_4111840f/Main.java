import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a matrix using the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row real vector using the createRowRealVector method
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{7.0, 8.0, 9.0});

        // Set the row vector into the matrix at a specific row index
        matrix.setRowVector(1, rowVector);

        // Read the row vector using the getRowRealVector method
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector to verify it matches the written vector
        System.out.println("Read Vector: " + readVector);
    }
}