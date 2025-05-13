import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one row and multiple columns
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a row real vector and write it to the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setRowVector(0, rowVector);
        
        // Read the row real vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print the read vector
        System.out.println(readVector);
    }
}