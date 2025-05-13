import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        
        // Create a matrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a new row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{7.0, 8.0, 9.0});
        
        // Set the first row of the matrix to the new row vector
        /* write */ matrix.setRowVector(0, rowVector);
        
        // Retrieve the first row as a vector
        /* read */ RealVector retrievedVector = matrix.getRowVector(0);
        
        // Print the retrieved vector
        System.out.println("Retrieved vector: " + retrievedVector);
    }
}