import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Write: create a row real vector
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Set the row vector into the matrix at row index 0
        matrix.setRowVector(0, rowVector);
        
        // Read: get the row real vector from the matrix at row index 0
        /* read */ RealVector readRowVector = matrix.getRowVector(0);
        
        // Print the read vector
        System.out.println(readRowVector);
    }
}