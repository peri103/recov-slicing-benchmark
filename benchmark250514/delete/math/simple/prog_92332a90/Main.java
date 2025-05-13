import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and multiple columns
        double[][] matrixData = new double[1][3];
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{1.0, 2.0, 3.0});
        
        /* write */ matrix.setRowVector(0, rowVector);

        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Output the read vector
        System.out.println(readVector);
    }
}