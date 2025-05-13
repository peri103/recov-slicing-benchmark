import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with a single row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector using the write method
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Replace the first row of the matrix with the created vector
        matrix.setRowVector(0, vector);

        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the vector to verify the read operation
        System.out.println(readVector);
    }
}