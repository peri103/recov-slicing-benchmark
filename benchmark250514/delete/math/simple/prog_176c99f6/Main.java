import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with sample data
        double[][] matrixData = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row vector using MatrixUtils.createRowRealVector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{10.0, 11.0, 12.0});
        
        // Replace the first row of the matrix with the new row vector
        matrix.setRowVector(0, rowVector);

        // Read the first row vector using MatrixUtils.getRowRealVector
        /* read */ RealVector readRowVector = matrix.getRowVector(0);

        // Print the read row vector
        System.out.println("Read Row Vector: " + readRowVector);
    }
}