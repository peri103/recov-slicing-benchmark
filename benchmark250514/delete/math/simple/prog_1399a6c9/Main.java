import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        RealMatrix matrix = MatrixUtils.createRealMatrix(1, 3);
        
        // Create a row vector using createRowRealVector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Set the row vector into the matrix
        matrix.setRowVector(0, /* write */ rowVector);
        
        // Retrieve the row vector using getRowVector
        RealVector retrievedRowVector = /* read */ matrix.getRowVector(0);
        
        // Print the retrieved row vector
        System.out.println(retrievedRowVector);
    }
}