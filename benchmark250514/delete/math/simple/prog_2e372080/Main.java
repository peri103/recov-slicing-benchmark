import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sample matrix
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Write: Create a column real vector from the matrix
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(matrix.getColumn(0));

        // Read: Retrieve the column real vector from the matrix
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);

        // Print the retrieved vector
        System.out.println(retrievedVector);
    }
}