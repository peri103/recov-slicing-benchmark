import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with zero values
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Create a row vector with values
        double[] rowValues = {1.0, 2.0, 3.0};
        
        // Write the row vector to the first row of the matrix
        /* write */ matrix.setRowVector(0, MatrixUtils.createRowRealVector(rowValues));

        // Read the row vector from the first row of the matrix
        /* read */ RealVector rowVector = matrix.getRowVector(0);

        // Print the values of the row vector
        System.out.println("Row Vector: " + rowVector);
    }
}