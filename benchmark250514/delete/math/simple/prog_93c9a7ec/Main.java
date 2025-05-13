import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with a single column
        double[][] matrixData = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a column real vector and set it to the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Get the column real vector from the matrix
        /* read */ RealVector retrievedColumnVector = matrix.getColumnVector(0);

        // Print the retrieved column vector
        System.out.println(retrievedColumnVector);
    }
}