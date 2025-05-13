import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the array to be used in the matrix
        double[][] data = {{1.0}, {2.0}, {3.0}};

        // Use the write method to create a column real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);

        // Use the read method to get the column real matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);

        // Print the column matrix to verify the value
        System.out.println(columnMatrix);
    }
}