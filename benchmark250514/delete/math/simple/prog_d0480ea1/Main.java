import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a RealMatrix
        double[][] data = { {1.0, 2.0, 3.0}, {4.0, 5.0, 6.0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a column vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[] {7.0, 8.0});
        
        // Set the column vector into the matrix
        matrix.setColumnVector(0, columnVector);
        
        // Read the column vector back using the read method
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Print the read vector
        System.out.println("Read Vector: " + readVector);
    }
}