import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to represent a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Use the write method to create a column real vector
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});

        // Update the matrix with the new column vector at column index 1
        matrix.setColumnVector(1, columnVector);

        // Use the read method to get the column real vector from the matrix at column index 1
        /* read */ RealVector readVector = matrix.getColumnVector(1);

        // Print the read vector to verify the value
        System.out.println("Column Vector at index 1: " + readVector);
    }
}