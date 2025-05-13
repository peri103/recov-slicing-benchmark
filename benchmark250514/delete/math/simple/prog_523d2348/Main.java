import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a row real vector using MatrixUtils
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Set the row vector to the matrix
        matrix.setRowVector(0, rowVector);
        
        // Get the row real vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print the read values
        System.out.println("Read Vector: " + readVector);
    }
}