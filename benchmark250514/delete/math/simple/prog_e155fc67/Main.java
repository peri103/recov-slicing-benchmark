import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a 2x2 matrix with some values
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Read the matrix and retrieve a specific value to ensure the write was successful
        /* read */ RealMatrix readMatrix = MatrixUtils.getRealMatrix(matrix.getData());
        
        // Print the value at position (0, 0) to verify the read operation
        System.out.println(readMatrix.getEntry(0, 0));
    }
}