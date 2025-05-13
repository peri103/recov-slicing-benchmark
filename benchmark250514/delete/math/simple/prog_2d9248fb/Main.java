import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Creating a RealMatrix from the data array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a column vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});
        
        // Insert the column vector into the matrix
        matrix.setColumnVector(1, columnVector);
        
        // Read the column vector back from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(1);
        
        // Print the read vector
        System.out.println(readVector);
    }
}