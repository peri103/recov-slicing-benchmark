import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix for demonstration
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Write: Create a row vector and set it in the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{10.0, 11.0, 12.0});
        /* write */ matrix.setRowVector(1, rowVector);

        // Read: Get the row vector from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(1);

        // Print the row vector to verify
        System.out.println(readRowVector);
    }
}