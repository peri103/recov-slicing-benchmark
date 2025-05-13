import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and some columns
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Set the row vector to the first row of the matrix
        matrix.setRowVector(0, rowVector);

        // Retrieve the row vector from the matrix
        /* read */ RealVector retrievedRowVector = matrix.getRowVector(0);

        // Print the retrieved row vector
        System.out.println(retrievedRowVector);
    }
}