import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector using the write method
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Replace the first row of the matrix with the new vector
        matrix.setRowVector(0, rowVector);

        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the vector to verify
        System.out.println(readVector);
    }
}