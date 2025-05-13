import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to use for creating a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        
        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Use createRowRealVector to write a row vector into the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[] {7.0, 8.0, 9.0});
        /* write */ matrix.setRowVector(1, rowVector);
        
        // Use getRowRealVector to read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);
        
        // Print the read vector
        System.out.println(readVector);
    }
}