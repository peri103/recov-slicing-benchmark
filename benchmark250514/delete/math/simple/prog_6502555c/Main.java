import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to represent a matrix
        double[][] data = { { 0, 0 }, { 0, 0 } };
        
        // Create a RealMatrix using MatrixUtils
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector using MatrixUtils and write it to the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[] { 1, 2 });
        /* write */ matrix.setColumnVector(0, columnVector);

        // Read the column vector from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the values of the read vector
        System.out.println(readVector);
    }
}