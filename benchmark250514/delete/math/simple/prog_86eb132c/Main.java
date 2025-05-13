import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to represent a column vector
        double[][] columnData = {{1.0}, {2.0}, {3.0}};

        // Create a column matrix using the write method
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Read the column matrix using the read method
        /* read */ RealMatrix readColumnMatrix = columnMatrix.getColumnMatrix(0);

        // Print the read column matrix
        System.out.println("Column Matrix:");
        for (int i = 0; i < readColumnMatrix.getRowDimension(); i++) {
            System.out.println(readColumnMatrix.getEntry(i, 0));
        }
    }
}