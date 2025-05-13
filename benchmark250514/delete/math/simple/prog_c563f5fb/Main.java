import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one column
        double[][] matrixData = {{0}, {0}, {0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a column vector
        double[] columnData = {1, 2, 3};
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);

        // Set the column vector to the matrix
        matrix.setColumnVector(0, columnVector);

        // Read the column vector from the matrix
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the vector to verify the values
        System.out.println(readColumnVector);
    }
}