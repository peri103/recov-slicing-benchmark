import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector using the write method
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(data[0]);

        // Set the row vector into the matrix
        matrix.setRowVector(0, rowVector);

        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);
    }
}