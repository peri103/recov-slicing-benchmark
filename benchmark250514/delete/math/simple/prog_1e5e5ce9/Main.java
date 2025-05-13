import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a column real matrix using the write method
        double[] columnData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Read the column real matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);

        // Print the read matrix
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }
    }
}