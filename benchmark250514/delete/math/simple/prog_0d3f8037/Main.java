import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector from the matrix
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Set the column vector to the matrix
        matrix.setColumnVector(0, columnVector);

        // Get the column real vector from the matrix
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);

        // Print the retrieved vector
        System.out.println(retrievedVector);
    }
}