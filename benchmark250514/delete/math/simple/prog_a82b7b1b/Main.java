import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with some data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector from a row
        RealVector vector = MatrixUtils.createRowRealVector(data[1]);
        
        // Replace the second row of the matrix with the new vector
        matrix.setRowVector(1, vector);
        
        // Retrieve the vector from the second row
        /* read */ RealVector readVector = matrix.getRowVector(1);
        
        // Print the retrieved vector
        System.out.println(readVector);
    }
}