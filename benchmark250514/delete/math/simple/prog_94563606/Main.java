import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Read the column vector
        /* read */ RealVector readVector = MatrixUtils.getColumnRealVector(matrix, 0);
        System.out.println(readVector);
    }
}