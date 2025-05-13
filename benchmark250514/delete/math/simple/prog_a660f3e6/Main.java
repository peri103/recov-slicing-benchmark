import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the matrix
        double[][] data = {{1}, {2}, {3}};

        // Create a column real matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(new double[]{1, 2, 3});

        // Read the column real matrix using the MatrixUtils class
        /* read */ RealMatrix columnMatrix = MatrixUtils.getColumnRealMatrix(data, 0);

        // Print the column matrix to verify the read operation
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}