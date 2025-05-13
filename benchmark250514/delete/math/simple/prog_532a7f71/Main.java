import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a RealMatrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector using createColumnRealVector method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});

        // Set the column vector into the matrix
        matrix.setColumnVector(0, columnVector);

        // Read the column vector using getColumnRealVector method
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the read vector
        System.out.println(readVector);
    }
}