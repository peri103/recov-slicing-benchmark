import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a column real vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{1.0, 2.0, 3.0});

        // Create a matrix for demonstration purposes
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Set the first column of the matrix to the created column real vector
        matrix.setColumnVector(0, columnVector);

        // Read the first column real vector from the matrix using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the read column vector to verify the result
        System.out.println("Read Column Vector: " + readColumnVector);
    }
}