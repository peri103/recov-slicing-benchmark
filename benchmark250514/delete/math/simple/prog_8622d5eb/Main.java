import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a matrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});

        // Set the first column of the matrix to the created column vector
        matrix.setColumnVector(0, columnVector);

        // Read the column vector back using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the read column vector
        System.out.println("Read Column Vector: " + readColumnVector);
    }
}