import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a row vector
        double[] rowData = {1.0, 2.0, 3.0};

        // Create a row real matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Read the row real matrix back using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);

        // Print the read matrix
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}