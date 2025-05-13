import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create the matrix
        double[][] data = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector
        double[] rowData = {1, 2, 3};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowData);

        // Set the row vector to the first row of the matrix
        matrix.setRowVector(0, rowVector);

        // Read the first row vector from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(0);
        
        // Print the read row vector
        System.out.println(readRowVector);
    }
}