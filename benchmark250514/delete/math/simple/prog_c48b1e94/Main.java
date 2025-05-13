import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        RealMatrix matrix = MatrixUtils.createRealMatrix(1, 3);
        
        // Create a row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Write the row vector into the matrix
        /* write */ matrix.setRowVector(0, rowVector);
        
        // Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print the read vector
        System.out.println(readVector);
    }
}