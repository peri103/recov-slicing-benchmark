import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix for demonstration purposes
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Write: Create a column vector and set it to the first column of the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10, 11, 12});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Read: Get the column vector from the first column of the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the values of the read vector
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}