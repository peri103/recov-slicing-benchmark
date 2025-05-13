import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a column matrix with some values
        double[][] columnData = { {1.0}, {2.0}, {3.0} };

        // Create the column real matrix using the write method
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Read the column matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);

        // Print the values of the read matrix to verify
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }
    }
}