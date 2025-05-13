import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Use write method to create a column real vector
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});

        // Set the column vector to the matrix
        matrix.setColumnVector(0, columnVector);

        // Use read method to get the column real vector
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the values of the read vector
        System.out.println(readVector);
    }
}