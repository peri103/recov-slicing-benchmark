import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with some data
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Create a vector to write into the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[] {10.0, 11.0, 12.0});
        
        /* write */ matrix.setRowVector(1, vector);
        
        // Read the vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);
        
        // Print the read vector
        System.out.println("Read Vector: " + readVector);
    }
}