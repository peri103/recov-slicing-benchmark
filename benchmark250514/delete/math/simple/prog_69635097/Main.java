import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one row and multiple columns
        double[][] data = {{1.0, 2.0, 3.0}};
        
        // Initialize a RealMatrix with the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector using the write method
        /* write */ RealVector vector = MatrixUtils.createRowRealVector(data[0]);
        
        // Set the vector as the first row of the matrix
        matrix.setRowVector(0, vector);
        
        // Retrieve the RealVector using the read method
        /* read */ RealVector retrievedVector = matrix.getRowVector(0);
        
        // Print the vector to verify
        System.out.println(retrievedVector);
    }
}