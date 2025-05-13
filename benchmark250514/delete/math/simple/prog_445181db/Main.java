import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and multiple columns
        double[][] matrixData = {{0.0, 0.0, 0.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row vector
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector rowVector = MatrixUtils.createRowRealVector(vectorData);
        
        // Write the row vector into the matrix
        /* write */ matrix.setRowVector(0, rowVector);

        // Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read vector: " + readVector);
    }
}