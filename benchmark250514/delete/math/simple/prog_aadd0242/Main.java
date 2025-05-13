import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a row vector to write into the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{10.0, 11.0, 12.0});
        
        /* write */ matrix.setRowVector(1, rowVector); // Write the row vector into the matrix at row 1
        
        /* read */ RealVector readVector = matrix.getRowVector(1); // Read the row vector from the matrix at row 1
        
        System.out.println("Read Vector: " + readVector);
    }
}