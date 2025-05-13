import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create a matrix using the data array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{5.0, 6.0});

        // Set the column vector to the matrix at column index 0
        /* write */ matrix.setColumnVector(0, columnVector);

        // Retrieve the column vector from the matrix at column index 0
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);

        // Print the retrieved vector
        System.out.println(retrievedVector);
    }
}