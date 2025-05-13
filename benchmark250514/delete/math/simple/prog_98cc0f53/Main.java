import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and some columns
        double[][] data = { {1.0, 2.0, 3.0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row real vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[] {4.0, 5.0, 6.0});
        
        // Replace the first row of the matrix with the new vector
        /* write */ matrix.setRowVector(0, rowVector);

        // Get the first row real vector
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print the vector to ensure it matches what was written
        System.out.println(readVector);
    }
}