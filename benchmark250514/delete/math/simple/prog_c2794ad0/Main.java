import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with some values
        double[][] matrixData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a row real vector using the write method
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{10, 11, 12});
        /* write */ matrix.setRowVector(1, rowVector); // Set the vector to the second row
        
        // Read the row real vector using the read method
        /* read */ RealVector readRowVector = matrix.getRowVector(1);
        
        // Print the read values to verify the operation
        System.out.println("Read Row Vector: " + readRowVector);
    }
}