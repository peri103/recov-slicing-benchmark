import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] matrixData = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a column vector from the matrix
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Set the column vector into the matrix
        matrix.setColumnVector(0, columnVector);
        
        // Read the column vector from the matrix
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        // Print the values of the read column vector
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println(readColumnVector.getEntry(i));
        }
    }
}